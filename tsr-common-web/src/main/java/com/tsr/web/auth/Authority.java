package com.rsos.web.auth;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rsos.api.domain.user.PermissionResource;
import com.rsos.api.domain.vo.user.Resource;
import com.rsos.api.service.user.PermissionResourceServiceApi;
import com.rsos.comm.util.PropertyUtils;
import com.rsos.comm.util.StringUtils;

/*
 * 后台用户权限限制
 * author:yulu
 */
public class Authority {
	
	private static final Logger logger = LoggerFactory.getLogger(Authority.class);
	
	public List<String> menuCodeArr;   //系统菜单编码
	public List<String> erpURLArr;   //erp返回的地址 数组
	public List<String> managerURLArr;  //后台菜单跳转页面数组
	
	/**
	 * 初始化Authority
	 * 参数：List<PermissionResource>
	 */
	public Authority(List<PermissionResource> permissonList){
		//初始化原SysAuthConst中的常量
		/*
		 * menuCodeArr  1#1    sub_system_id#resource_code
		 * erpURLArr  userinfoList   resource_code
		 * managerURLArr  userinfo/list.htm  resource_url
		 */
		menuCodeArr=new ArrayList<String>();
		erpURLArr=new ArrayList<String>();
		managerURLArr=new ArrayList<String>();
		
		if(permissonList!=null && permissonList.size()>0){
			int size=permissonList.size();
			for(int i=0;i<size;i++){
				menuCodeArr.add(permissonList.get(i).getSubSystemId()+"#"+permissonList.get(i).getResourceCode());
				erpURLArr.add(permissonList.get(i).getResourceCode());
				managerURLArr.add(permissonList.get(i).getResourceUrl());
			}
		}
		
	}
	/**
	 * 用户是否可以访问某个页面
	 * @param userResources   用户权限列表
	 * @param pageUrl	访问的页面
	 * @return 是否可以访问 true 可以访问 false 不能访问
	 */
	public  boolean canUserAccessPage(List<Resource> userResources,String pageUrl){
		
		logger.info("canUserAccessPage:---begin");
		//如果不是需要拦截的URL，直接返回true即可
		//读取配置文件，如果权限未开启，直接返回true  =0
		int auth_state=PropertyUtils.getIntValue("auth_state", 0);
		
		if(auth_state==0){
			return true;
		}
		SysAuthConst sysAuthConst=new SysAuthConst(this);
		
		if(!sysAuthConst.isNeedToCheckURL(pageUrl)){
			return true;
		}
		
		//获取list
		List<SysMenuItemCode> list=getuserMenu(userResources);
		
		if(list==null || list.size()==0){
			return false;
		}
		
		int size=list.size();
		logger.info("size:"+size);
		
		//看list中的 managerURl 是否有pageURL，有就是 true，否则就是false
		
		for(int i=0;i<size;i++){
			logger.debug("ManagerURL:"+list.get(i).getManagerURL());
			logger.debug("pageURL:"+pageUrl);
			
			if(list.get(i).getManagerURL().equals(pageUrl)){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 返回用户的菜单code List,用于决定用户可以显示几个菜单
	 */
	public List<SysMenuItemCode> getuserMenu(List<Resource> userResources){
		return getuserMenu(userResources,"");
	}
	
	/**
	 * 返回用户的菜单code List,用于决定用户可以显示几个菜单
	 */
	public List<SysMenuItemCode> getuserMenu(List<Resource> userResources,String topMenuIndex){
		
		logger.info("getUserMenu---begin");
		
		//此处打印从DB中获取的用户权限信息，测试
		//List<PermissionResource> permissionList=permissionResourceService.getAllPermissionResources();
		List<SysMenuItemCode> list=new ArrayList<SysMenuItemCode>();
		
		
		/*if(permissionList!=null){
			int size=permissionList.size();
			for(int i=0;i<size;i++){
				logger.info("----DB_PermissionResource:"+permissionList.get(i).getResourceUrl());
			}
		}*/
		
		//读取配置文件，如果权限未开启，直接返回所有的页面权限
		int auth_state=PropertyUtils.getIntValue("auth_state", 0);
		
		SysAuthConst sysAuthConst=new SysAuthConst(this);
		if(auth_state==0){
			//返回所有的权限
			list = sysAuthConst.getAllSysMenuItemCode();
		} else {
			int size=userResources.size();
			for(int i=0;i<size;i++){
				SysMenuItemCode sysMenuItemCode=sysAuthConst.getSysMenuItemCodeByErpURL(userResources.get(i).getUrl());
				if(sysMenuItemCode!=null){
					list.add(sysMenuItemCode);
				}
			}
		}
		//过滤tab
		if (!StringUtils.isStrNull(topMenuIndex) ){
			for (int i=list.size()-1;i >= 0;i--){
				SysMenuItemCode sysMenuItemCode = list.get(i);
				String menuCode = sysMenuItemCode.getMenuCode();
				String menuId[] = menuCode.split("#");
				if (menuId!=null && !menuId[0].equals(topMenuIndex)){
					list.remove(sysMenuItemCode);
				}
			}			
		}

		logger.info("getUserMenu---end  list.size:"+list.size());
		return list;		
	}
}
