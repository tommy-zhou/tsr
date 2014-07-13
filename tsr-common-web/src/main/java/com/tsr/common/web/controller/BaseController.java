//package com.tsr.common.web.controller;
//
//import java.io.PrintWriter;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.beans.propertyeditors.CustomNumberEditor;
//import org.springframework.validation.BindException;
//import org.springframework.validation.Validator;
//import org.springframework.web.bind.ServletRequestDataBinder;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//
//import com.tsr.comm.custom.MyStringTrimmerEditor;
//import com.tsr.comm.util.DateTimeUtils;
//import com.tsr.comm.util.StringUtils;
//import com.tsr.common.web.bean.SystemSession;
//
//
//
///**
// * Crontroller类的基础类，可以 除掉参数中的空格
// * 
// * 
// */
//public class BaseController {
//	@InitBinder
//	protected void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat(
//				DateTimeUtils.dateTimeString);
//		dateFormat.setLenient(false);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(
//				dateFormat, false));
//		binder.registerCustomEditor(Integer.class, new CustomNumberEditor(
//				Integer.class, true));
//		binder.registerCustomEditor(String.class, new MyStringTrimmerEditor(true));
//	}
//
//	/**
//	 * 校验绑定对象
//	 */
//	protected BindException validateRequestBean(Validator validator, Object entity)
//			throws Exception {
//		Class<? extends Object> target = entity.getClass();
//		ServletRequestDataBinder binder = new ServletRequestDataBinder(entity,StringUtils.firstCharToLow(target.getSimpleName()));
//		BindException errors = new BindException(binder.getBindingResult());
//		validator.validate(entity, errors);
//		return errors;
//	}
//	
//	/**
//	 * 获取登录用户名
//	 * @param request
//	 * @return
//	 */
//	protected String getLoginUserName(HttpServletRequest request){
//		String userName = null;
//		SystemSession session = getSystemSession(request);
//		if(session != null) {
//			SystemUser loginUser = (SystemUser)session.getAttribute(CommonConstants.LOGIN_USER_KEY);
//			if(loginUser != null){
//				userName = loginUser.getSystemUserName();
//			}
//		}
//		return userName;
//	}
//	
//	/**
//	 * 获取session中的每页记录数
//	 * @param request
//	 * @param onePageCount 默认每页记录数
//	 * @return
//	 */
//	protected int getSessionOnePageCount(HttpServletRequest request,int onePageCount){
//		SystemSession session = getSystemSession(request);
//		if(session != null) {
//			String onePageCountString = (String)session.getAttribute("onePageCount");
//			if (!com.rsos.comm.util.StringUtils.isStrNull(onePageCountString)){
//				onePageCount = Integer.parseInt(onePageCountString);
//			}
//		}
//		return onePageCount;
//	}
//	/**
//	 * 获取登录用户对象
//	 * @param request
//	 * @return
//	 */
//	protected SystemUser getLoginUser(HttpServletRequest request){
//		SystemUser loginUser = null;
//		SystemSession session = getSystemSession(request);
//		if(session != null) {
//			loginUser = (SystemUser)session.getAttribute(CommonConstants.LOGIN_USER_KEY);
//		}
//		return loginUser;
//	}
//
//	/**
//	 * 获取系统Session
//	 * @param request
//	 * @return
//	 */
//	protected SystemSession getSystemSession(HttpServletRequest request){
//		SystemSession session = (SystemSession)request.getAttribute(CommonConstants.OS_SESSION_KEY);
//		return session;
//	}
//	
//	/**
//	 * 初始化输出
//	 * @param fileName
//	 * @param response
//	 * @return
//	 * @throws Exception
//	 */
//	protected PrintWriter initPrintWriter(String fileName,HttpServletResponse response) throws Exception{
//		   response.setContentType("application/octet-stream;charset=GBK");
//		   response.setHeader("Content-Disposition","attachment;  filename="+fileName);
//		   PrintWriter out = response.getWriter();//放在第一句是会出现乱码 
//		   return out;
//	}
//	
//	/**
//	 * 输出数据
//	 * @param writer
//	 * @param data
//	 * @param isEnd
//	 * @throws Exception
//	 */
//	protected void writeData(PrintWriter writer ,String data , boolean isEnd) throws Exception{
//		writer.write(data);
//		writer.flush();
//		if(isEnd){
//			writer.close();
//		}
//	}
//	
//	/**
//	 * 根据request取得IP
//	 * @param request
//	 * @return
//	 */
//	public String getIpAddr(HttpServletRequest request) {
//        String ip = request.getHeader("x-forwarded-for");
//        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getRemoteAddr();
//        }
//        
//        String[] ips = ip.split(",");
//        
//        if(ips.length>0){
//        	ip=ips[0];
//        }
//        
//        return ip;
//    }
//	
//}
