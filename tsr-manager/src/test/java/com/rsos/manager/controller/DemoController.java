//package com.rsos.manager.controller;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//import javax.annotation.Resource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.rsos.api.domain.basic.ServiceResult;
//import com.rsos.api.service.order.OrderShipmentServiceApi;
//import com.rsos.api.service.task.UpdateOrderShipmentTrackServiceApi;
//import com.rsos.comm.util.StringUtils;
//import com.rsos.comm.util.fastdfs.FastDFS;
//import com.rsos.comm.util.fastdfs.FastDFSResult;
//
///**
// * 
// * @author yulu
// * 
// */
//@Controller
//@RequestMapping("demo")
//public class DemoController {
//	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
//	
//	@Resource
//	private UpdateOrderShipmentTrackServiceApi updateOrderShipmentTrackService;
//	@Resource
//	private OrderShipmentServiceApi orderShipmentService;
//	@RequestMapping("uploadimg.htm")
//	public ModelAndView upload(ModelAndView mav){
//		mav.setViewName("demo/uploadimg");
//		return mav;
//	}
//	
//	@RequestMapping("uploadimg_do.htm")
//	public ModelAndView upload_do(ModelAndView mav,@RequestParam("uploadimg") MultipartFile file){
//		logger.info("uploadimg_do start");
//		//暂时将File写在本地
//		try {
//			InputStream ins=file.getInputStream();
//			//FileUtils.copyInputStreamToFile(ins, new File("D:\\savedhello.jpg"));
//			FastDFSResult result=FastDFS.uploadFile(ins);
//			
//			if(result.is_success){
//				logger.info("upload success!");
//				logger.info("file_url:"+result.remote_file_url);
//				
//				//获取上传的图片地址
//				String imgurl=FastDFS.getFastDFSFileURL(result.remote_file_url);
//				
//				logger.info("img_url:"+imgurl);
//				mav.addObject("Message","图片上传成功");
//				String html_seeimg="<a href='"+imgurl+"' target='_blank'>点击此处查看图片</a>";
//				mav.addObject("Url",html_seeimg);
//			}else{
//				logger.info("upload fail!");
//				logger.info("errorMessage:"+result.error_info);
//				mav.addObject("Message","图片上传失败");
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			mav.addObject("Message","图片上传失败");
//		}
//		
//		mav.setViewName("demo/uploadimg");
//		logger.info("uploadimg_do end");
//		return mav;
//	}
//	
//	/**
//	 * 传入唯品会订单号,发货
//	 * 必须有发货单
//	 * @param mav
//	 * @param orderOutSn
//	 * @return
//	 */
//	@RequestMapping("vipShipment.htm")
//	@ResponseBody
//	public String vipShipment(@RequestParam(value="vipOrderSn",required=true)String orderOutSn) {
//		ServiceResult<Boolean> serviceResult=new ServiceResult<Boolean>();
//		if (!StringUtils.isStrNull(orderOutSn)) {
//			serviceResult= orderShipmentService.vipShipment(orderOutSn);
//		}else {
//			serviceResult.setComment("填写的外部订单号有误.");
//		}
//		
//		
//		return StringUtils.objectToString(serviceResult);
//	}
//}
