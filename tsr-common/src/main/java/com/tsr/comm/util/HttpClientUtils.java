package com.tsr.comm.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class HttpClientUtils {
	
	public static void get(GetMethod getMethod, Map<String, String> requestBody) {
		// 请求客户端
		HttpClient client = HttpClientBuilder.build(); 
		
		if(requestBody != null){
			// map 转成 nameValuePairs 数组
			NameValuePair [] nameValuePairs = map2NameValuePairs(requestBody);
			getMethod.setQueryString(nameValuePairs);
		}
		
		try {
			client.executeMethod(getMethod);
		} catch (HttpException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * http post 请求
	 * @author tongc
	 * @param url
	 * @param requestBody
	 * @return
	 */
	public static String post(String url,String charset, Map<String, String> requestBody) {

		// 请求客户端
		HttpClient client = HttpClientBuilder.build();

		// 请求方法 post
		PostMethod postMethod = new PostMethod(url);
		postMethod.getParams().setParameter(
				HttpMethodParams.HTTP_CONTENT_CHARSET, charset);
		
		// map 转成 nameValuePairs 数组
		NameValuePair [] nameValuePairs = map2NameValuePairs(requestBody);
		
		// 请求体
		postMethod.setRequestBody(nameValuePairs);

		// 返回内容
		String response = null;

		// 返回状态
		int statusCode = 0;
		
		try {
			statusCode = client.executeMethod(postMethod);
		} catch (HttpException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		// 正常返回，取值
		if (statusCode == HttpStatus.SC_OK) {

			byte[] responseBody = null;

			try {
				responseBody = postMethod.getResponseBody();
				
				response = new String(responseBody,charset);
				
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			

		} else {
			response = "status:" + statusCode;
		}
		return response;
	}
	
	
	/**
	 * 发送https请求
	 * @param url
	 * @param requestBody
	 * @return
	 */
//	public static String httpsPost(String url, Map<String, String> requestBody) {
//
//		Protocol myhttps = new Protocol("https", new MySSLSocketFactory(), 443);
//		
//		Protocol.registerProtocol("https", myhttps); 
//		
//		return post(url,"utf-8", requestBody);
//	}
	/**
	 * map参数类型转换成nameValuePair数组类型
	 * @author tongc
	 * @param map
	 * @return NameValuePair []
	 */
	private static NameValuePair [] map2NameValuePairs(Map<String, String> map) {

		Set<String> keySet = map.keySet();
		
		// 临时数组
		String[] tmp = {};
		
		// map keyset转成数组
		String[] names = keySet.toArray(tmp);
		int len = keySet.size();
		
		NameValuePair[] nameValuePairs = new NameValuePair[len];
		for (int i = 0; i < len; i++) {
			
			nameValuePairs[i] = new NameValuePair(names[i], map.get(names[i]));
		}
				
		return nameValuePairs;
	}
	
	//TODO 测试
	public static void main(String[] args) {
		
		String url = "127.0.0.1/hxshop-manager";
		Map<String, String> requestBody = new HashMap<String, String>();
		
		post(url,"utf-8", requestBody);
	}

}
