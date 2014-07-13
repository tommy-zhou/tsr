package com.rsos.web.auth;

/**
 * 系统菜单项 与 用户url的转换
 * @author yulu
 * 定义了 userResource 中 URL 与 系统 url，与code的对应关系
 */
public class SysMenuItemCode {
	
	public String menuCode;   //菜单项标识
	public String erpURL;     //erpURl
	public String managerURL; //管理系统URL
	
	public SysMenuItemCode(String menuCode,String erpURL,String managerURL){
		this.menuCode=menuCode;
		this.erpURL=erpURL;
		this.managerURL=managerURL;
	}
	
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getErpURL() {
		return erpURL;
	}
	public void setErpURL(String erpURL) {
		this.erpURL = erpURL;
	}
	public String getManagerURL() {
		return managerURL;
	}
	public void setManagerURL(String managerURL) {
		this.managerURL = managerURL;
	}
}
