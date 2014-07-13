//package com.tsr.manager.controller.comm;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.rsos.api.domain.basic.ServiceResult;
//import com.rsos.api.service.cms.CmsServiceApi;
//import com.rsos.web.bean.JsonResult;
//import com.rsos.web.controller.BaseController;
//
//@Controller
//public class CommonController extends BaseController {
//
//	@Resource
//	private CmsServiceApi cmsService;
//	
//	/**
//	 * 
//	 * 用于判断楼层是否显示正常
//	 * 
//	 * 每层都是固定数量的商品显示，列如现在的indesx3.vm的。
//	 * <div class="f0C"> 中显示8个商品。
//	 * 判断数据库中数据web_page_div中web_div_name在web_page_object中有product几个，当前在使用时间范围。
//	 * 如果是少于8个就说明有问题，反之就ok。
//	 * 
//	 * @param floor
//	 * @param request
//	 * @param mav
//	 * @return
//	 */
//	@RequestMapping("indexFloor.htm")
//	@ResponseBody
//	public JsonResult indexFloor(@RequestParam("floor")Integer floor,
//			HttpServletRequest request,
//			ModelAndView mav) {
//		
//		JsonResult jr = new JsonResult();
//		
//		ServiceResult<Boolean> serviceResult=new ServiceResult<Boolean>();
//		//查看首页
//		serviceResult = cmsService.getIndexFloorNomal(floor);
//		
//		jr.setOk(serviceResult.isOk());
//		jr.setMessage(serviceResult.getMsgCode());
//		
//		return jr;
//	}
//}
