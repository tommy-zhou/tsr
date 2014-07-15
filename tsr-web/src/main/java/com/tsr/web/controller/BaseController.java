package com.tsr.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.tsr.comm.custom.MyStringTrimmerEditor;
import com.tsr.comm.util.DateTimeUtils;
import com.tsr.comm.util.StringUtils;


/**
 * Crontroller类的基础类，可以 除掉参数中的空格
 * @author tongc
 *
 */
public class BaseController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(BaseController.class);
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				DateTimeUtils.dateTimeString);
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
		binder.registerCustomEditor(Integer.class, new CustomNumberEditor(
				Integer.class, true));
		binder.registerCustomEditor(String.class, new MyStringTrimmerEditor(false));
	}

	/**
	 * 校验绑定对象
	 */
	protected BindException validateRequestBean(Validator validator, Object entity)
			throws Exception {
		Class<? extends Object> target = entity.getClass();
		ServletRequestDataBinder binder = new ServletRequestDataBinder(entity,StringUtils.firstCharToLow(target.getSimpleName()));
		BindException errors = new BindException(binder.getBindingResult());
		validator.validate(entity, errors);
		return errors;
	}
	
//	/**
//	 * 获取登录用户对象
//	 * @param request
//	 * @return
//	 */
//	protected int getLoginUserId(HttpServletRequest request){
//		int loginUserId = -1;
//		SystemSession session = getSystemSession(request);
//		if(session != null) {
//			Object obj = session.getAttribute(CommonConstants.LOGIN_USER_KEY);
//			if(obj != null && !StringUtils.isStrNull(String.valueOf(obj)) ){
//				loginUserId =Integer.parseInt(obj.toString());
//			}
//		}
//		return loginUserId;
//	}
	
	
//	/**
//	 * 获取登录用户对象
//	 * @param request
//	 * @return
//	 */
//	public UserInfo getLoginUser(HttpServletRequest request){
//		
//		int userId = getLoginUserId(request);
//		UserInfo loginUser = userService.getUserInfoByID(userId);
//		
//		return loginUser;
//	}

//	/**
//	 * 获取系统Session
//	 * @param request
//	 * @return
//	 */
//	protected SystemSession getSystemSession(HttpServletRequest request){
//		SystemSession session = (SystemSession)request.getAttribute(CommonConstants.SHOP_SESSION_KEY);
//		return session;
//	}
	
	/**
	 * 根据request取得IP
	 * @param request
	 * @return
	 */
	public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        
        String[] ips = ip.split(",");
        
        if(ips.length>0){
        	ip=ips[0];
        }
        
        return ip;
    }
	

	

}
