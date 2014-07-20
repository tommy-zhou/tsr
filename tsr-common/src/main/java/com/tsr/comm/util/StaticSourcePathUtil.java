package com.tsr.comm.util;

import java.util.Set;

/**
 * 静态资源路径工具
 * @author lirui
 */
public class StaticSourcePathUtil {
	
	public static String sourceUrl(String sourceUrl){
		sourceUrl = PropertyUtils.getString("staticSource.path") + sourceUrl;
		return sourceUrl;
	}
	public static String searcherUrl(String action){
		action = (PropertyUtils.getString("search.url") + action).trim();
		return action;
	}
	public static String imgFormat(String imgPath,Integer width,Integer height){
		return PropertyUtils.getString("FASTDFS_SERVER") + imgPath + "." + width+ "x" + height + ".jpg";
	}
	
	// 图片URL加前缀
	public static String imgUrlFormat(String imgPath,Integer width,Integer height,Integer index){
		String strPrefix =  getServerName(index);
		
		return strPrefix + imgPath + "." + width+ "x" + height + ".jpg";
	}

	public static String getJsAndCssVersion(){
		//获取js  css version ,默认为1.0
		return PropertyUtils.getString("js_css_version","1.0");
	}
	
	public static String getJsAndCssUrl(String url){
		//获取js  css url
		return PropertyUtils.getString("js_css_url") + url + "?v=" + getJsAndCssVersion();
	}
	
	public static String getHxshopUrl(String sourceUrl){
		return PropertyUtils.getString("HXSHOP_URL", "www.hxshop.com") + sourceUrl;
	}
	
	/**
	 * 获取图片服务器地址
	 * @param index
	 * @return
	 */
	public static String getServerName(int index){
		
		//获取图片服务器地址
		Set<String> setServices = PropertyUtils.getkeys("^FASTDFS_SERVER_0.*");
		
		int size = setServices.toArray().length;
		int tempIndex = index % size;
		
		return PropertyUtils.getString((String)setServices.toArray()[tempIndex]);
	}
	
	/**
	 * 获取图片服务器地址数量
	 * 
	 * @return	图片服务器地址数量
	 */
	public static int imgUrlCount(){
		
		//获取图片服务器地址
		Set<String> setServices = PropertyUtils.getkeys("^FASTDFS_SERVER_0.*");
		
		int size = setServices.toArray().length;
		return size;
	}

}
