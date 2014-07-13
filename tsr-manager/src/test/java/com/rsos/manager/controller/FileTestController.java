//package com.rsos.manager.controller;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.alibaba.fastjson.JSONObject;
//import com.rsos.comm.util.fastdfs.FastDFS;
//import com.rsos.comm.util.fastdfs.FastDFSResult;
//import com.rsos.web.controller.BaseController;
//
//@Controller
//@RequestMapping("demo")
//public class FileTestController extends BaseController{
//	
//	@RequestMapping("init.htm")
//	public ModelAndView init(ModelAndView mav){
//		mav.setViewName("demo/filetest");
//		//mav.setViewName("demo/Newuploadimg");
//		return mav;
//	}
//	
//	@RequestMapping("ssssuploadimg_do.htm")
//	@ResponseBody
//	public String upload_do(ModelAndView mav,
//			MultipartHttpServletRequest request,
//			@RequestParam(value= "filedata",required=false) MultipartFile file){
//		String imgUrl = null;
//		try {
//			FastDFSResult result =  null;
//			InputStream stream = file.getInputStream();
//			result = FastDFS.uploadFile(stream);
//			//文件上传成功
//			if(result.is_success){
//				//获取上传的图片地址
//				String imgurl=FastDFS.getFastDFSFileURL(result.remote_file_url);
//				imgUrl = imgurl;
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
//		return imgUrl;
//	}
//	
//	
//	public static void main(String[] args) {
//		String data = "{\"data\":\"xx\",\"data2\":\"xxx\"}";
//		JSONObject obj = JSONObject.parseObject(data);
//		obj.get("data");
//		
//	}
//	
//}
