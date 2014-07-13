package com.tsr.common.web.util;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.redis.core.RedisTemplate;

import com.tsr.comm.util.PropertyUtils;
import com.tsr.comm.util.SpringUtils;
import com.tsr.comm.util.StringUtils;
import com.tsr.common.web.bean.SystemSession;



/**
 * 自定义Session的工具类
 * @author Tommy
 *
 */
public class SessionManager {
	
	/**
	 * 获取一个session
	 * @param request
	 * @param response
	 * @return
	 */
	public static SystemSession getSession(HttpServletRequest request,HttpServletResponse response){
		SystemSession session = null;
		String cookieName = getCookieName();
		Cookie cookie = CookieUtil.getCookieByName(request, cookieName);
		if(cookie == null){
			session = createSession(request,response);
		}else{
			RedisTemplate<String,SystemSession> redisTemplate = getRedisTemplate();
			session = (SystemSession)redisTemplate.opsForValue().get(cookie.getValue());
			if(session == null){
				session = createSession(request,response);
			}else{
				/**
				 * 设置session 有效时间
				 */
				
				long sessionTimeout = getSessionTimeout();
				redisTemplate.expire(session.getSessionId(), sessionTimeout, TimeUnit.SECONDS);
			}
		}
		return session;
	}
	
	/**
	 * 新建一个session
	 * @param request
	 * @param response
	 * @return
	 */
	private static SystemSession createSession(HttpServletRequest request,HttpServletResponse response){
		SystemSession session = new SystemSession();;
		String sessionKey = generateSessionKey();
		RedisTemplate<String,SystemSession> redisTemplate = getRedisTemplate();
		session.setSessionId(sessionKey);
		redisTemplate.opsForValue().set(sessionKey, session);
		/**
		 * 设置session 有效时间
		 */
//		redisTemplate.expire(sessionKey, CommonConstants.OS_SESSION_TIMEOUT, TimeUnit.SECONDS);
//		response.setHeader("Set-Cookie",  CommonConstants.OS_SESSION_KEY+"="+sessionKey+";Path=/;HTTPOnly");
		long sessionTimeout = getSessionTimeout();
		
		String cookieName = getCookieName();
		
		String domain = getDomain();
		if(domain != null){
			domain = ";Domain=" + domain;
		}else {
			domain = "";
		}
		redisTemplate.expire(sessionKey, sessionTimeout, TimeUnit.SECONDS);
		response.setHeader("Set-Cookie",  cookieName + "="+sessionKey + domain +";Path=/;HTTPOnly");
		return session;
	}
	/**
	 * 通过uuid生成sessionID
	 * @return
	 */
	private static String generateSessionKey(){
		String sessionKey = UUID.randomUUID().toString(); 
		return sessionKey.replace("-","");
	}
	/**
	 * 更新session数据内容
	 * @param sessionKey
	 * @param session
	 */
	public static void updateSession(String sessionKey,SystemSession session){
		RedisTemplate<String,SystemSession> redisTemplate = getRedisTemplate();
		redisTemplate.opsForValue().set(sessionKey, session);
		/**
		 * 设置session 有效时间
		 */
		
		long sessionTimeout = getSessionTimeout();
		
		redisTemplate.expire(sessionKey, sessionTimeout, TimeUnit.SECONDS);
	}
	/**
	 * 删除session,使其失效
	 * @param sessionKey
	 */
	public static void deleteSession(String sessionKey){
		RedisTemplate<String,SystemSession> redisTemplate = getRedisTemplate();
		redisTemplate.delete(sessionKey);
	}
	
	private static RedisTemplate<String,SystemSession> getRedisTemplate(){
		@SuppressWarnings("unchecked")
		RedisTemplate<String,SystemSession> redisTemplate = (RedisTemplate<String,SystemSession>)SpringUtils.getBean("redisTemplate");
		return redisTemplate;
	}
	
	/**
	 * 取过期时间
	 * @return
	 */
	private static long getSessionTimeout(){
		
		// 定义默认sessionKey和过期时间 半小时
		long dftSessionTimeout = 30 * 60;
		
		String cfgSessionTimeout = PropertyUtils.getString("sessionTimeout");
		
		if(!StringUtils.isStrNull(cfgSessionTimeout)){
			dftSessionTimeout = Long.parseLong(cfgSessionTimeout);
		}
		
		return dftSessionTimeout;
	}
	
	/**
	 * 取cookieName
	 * @return
	 */
	private static String getCookieName(){
		String dftCookieName = "OS_SYSTEM_SESSION_ID";
		
		String cfgCookieName = PropertyUtils.getString("cookieName");
		
		if(!StringUtils.isStrNull(cfgCookieName)){
			dftCookieName = cfgCookieName ;
		}
		return dftCookieName;
	}
	
	/**
	 * 取得domain
	 * @return
	 */
	private static String getDomain(){
		
		String dftDomain = null;
		
		String cfgDomain = PropertyUtils.getString("HXSHOP_DOMAIN");
		
		if(!StringUtils.isStrNull(cfgDomain)){
			dftDomain = cfgDomain ;
		}
		return dftDomain;
	}
}
