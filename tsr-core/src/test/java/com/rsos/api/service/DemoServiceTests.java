//package com.rsos.api.service;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.rsos.api.domain.basic.ServiceResult;
//import com.rsos.api.domain.user.SystemCode;
//import com.rsos.api.service.comm.SystemCodeServiceApi;
//
//
//public class DemoServiceTests extends AbstractServiceTests {
//	@Resource
//	private SystemCodeServiceApi systemCodeService;
//	
//	private static final Logger logger = (Logger) LoggerFactory.getLogger(DemoServiceTests.class);
//	
//	
//	//测试接口，使用时注释掉 applicationcontext.xml中的   <import resource="dubbo-provider-config.xml"/> 这一行
//	@Test
//	public void getMedia_type(){
//		SystemCode systemCode=new SystemCode();
//		//systemCode.setCodeType("media_type");
//		ServiceResult<List<SystemCode>> serviceResult=systemCodeService.getSystemCodeListByQuery(systemCode);
//		
//		if(serviceResult.isOk()){
//			logger.info("success");
//			logger.info("---------------list:"+serviceResult.getData().toString());
//		}else{
//			logger.info("fail");
//		}
//				
//	}
//	
//	@Test
//	public void helloword(){
//		for(int i=0;i<10;i++){
//			logger.info("---------HelloWorld--------");
//		}
//	}
//}
