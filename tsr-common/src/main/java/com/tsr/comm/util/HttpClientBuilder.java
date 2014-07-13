package com.tsr.comm.util;

import org.apache.commons.httpclient.HttpClient;

public class HttpClientBuilder {
	
	private HttpClientBuilder(){
		
	}
	
	public static HttpClient build(){
		
		// 默认超时设置
		long connTimeout = 10000;
		int soTimeout = 10000;
		
		return build(connTimeout, soTimeout);
	}

	public static HttpClient build(long connTimeout, int soTimeout){
		
		HttpClient client = new HttpClient();
		client.getParams().setConnectionManagerTimeout(connTimeout);
		client.getParams().setSoTimeout(soTimeout);
		
		return client;
	}
	
}
