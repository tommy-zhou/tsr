package com.tsr.manager.web.interceptor;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.rsos.api.domain.user.PermissionResource;
import com.rsos.api.domain.user.SystemUser;
import com.rsos.api.service.user.PermissionResourceServiceApi;
import com.rsos.comm.constants.CommonConstants;
import com.rsos.comm.util.JSEscape;
import com.rsos.comm.util.StringUtils;
import com.rsos.web.auth.Authority;
import com.rsos.web.bean.SystemSession;
import com.rsos.web.util.SessionManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 判断用户权限，未登录用户跳转到登录页面
 * @author Tommy
 *
 */
public class SecurityInterceptor extends HandlerInterceptorAdapter {

	private List<String> excludedUrls;
	
	private static final Logger logger = LoggerFactory.getLogger(SecurityInterceptor.class);
	
	@Resource
	private PermissionResourceServiceApi permissionResourceService;
	
	public List<PermissionResource> getAuth(){
			List<PermissionResource> permissionList=permissionResourceService.getAllPermissionResources();
			return permissionList;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		SystemSession session = SessionManager.getSession(request, response);
		request.setAttribute(CommonConstants.OS_SESSION_KEY, session);
		if(excludedUrls != null){
			String requestUri = request.getRequestURI();
		    for (String url : excludedUrls) {
		      if (requestUri.endsWith(url)) {
		        return true;
		      }
		    }
		}
		if(session == null || session.getAttribute(CommonConstants.LOGIN_USER_KEY)==null) {
			//记录登录前页面
			//当前url
		    StringBuffer beforeUrl = request.getRequestURL();
		    //参数
            if(!StringUtils.isStrNull(request.getQueryString())){
            	beforeUrl.append("?").append(request.getQueryString());
            }
			response.setHeader("Set-Cookie",  CommonConstants.OS_BEFORE_LOGIN_PAGE+"="+JSEscape.escape(beforeUrl.toString())+";Path=/;HTTPOnly");
			response.sendRedirect(request.getContextPath() + "/login.htm");
			return false;
		}
		//能否访问该页面
		String requestUri = request.getRequestURI();
	   //requestUri:/rsos-manager/userinfo/list.htm
	   //userinfo/list.htm
	   //SystemUser systemUser=this.getLoginUser(request);
	   SystemUser loginUser = null;
		if(session != null) {
			
			logger.info("用户已登录，检查权限");
			
			
			loginUser = (SystemUser)session.getAttribute(CommonConstants.LOGIN_USER_KEY);
			
			String managerURL=requestUri.replace("/rsos-manager/", "");
			   //无权限访问
			logger.info("----------managerURL:"+managerURL);
			 
		    //不是 login.htm 跳转到login.htm 否则允许跳转
			Authority authority=new Authority(getAuth());
			if(!authority.canUserAccessPage(loginUser.getResources(), managerURL)){
				   logger.info("无权限，访问页面:"+managerURL);
				   //清除session和cookie重新定向到此页面
				   logger.info("重定向到退出页面");
				   response.sendRedirect(request.getContextPath() + "/logout.htm");
				   return false;
			 }
			
		}
		
		
		String onePageCount = request.getParameter("onePageCount");
		if (!StringUtils.isStrNull(onePageCount)){
			session.setAttribute("onePageCount", onePageCount);
		}
		return super.preHandle(request, response, handler);
	}

	public void setExcludedUrls(List<String> excludedUrls) {
		this.excludedUrls = excludedUrls;
	}

}
