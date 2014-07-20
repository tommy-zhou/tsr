package com.tsr.web.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tsr.api.bean.ProductGoods;
import com.tsr.api.service.ProductGoodsServiceApi;
import com.tsr.common.web.bean.JsonResult;


@RequestMapping("goods")
public class ProductGoodsController extends BaseController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(ProductGoodsController.class);
	
	@Resource 
	private ProductGoodsServiceApi productGoodsService;
	
	@RequestMapping("/{productGoodsId}.htm")
	public ModelAndView goodsDetail(HttpServletRequest request,
			@PathVariable Integer productGoodsId,
			ModelAndView mav){
		ProductGoods productGoods = productGoodsService.getAllInfo(productGoodsId);
		List<ProductGoods> recommendGoods =  productGoodsService.recommend(productGoods);
		mav.addObject("productGoods", productGoods);
		mav.addObject("recommendGoods", recommendGoods);
		mav.setViewName("goods_detail");
		return mav;
	
	}
	
	@RequestMapping("/r_{productGoodsId}.htm")
	@ResponseBody
	public JsonResult recommend(HttpServletRequest request,
			@PathVariable Integer productGoodsId){
		JsonResult result = new JsonResult();
		ProductGoods productGoods = productGoodsService.get(productGoodsId);
		List<ProductGoods> resultData =  productGoodsService.recommend(productGoods);
		result.setData(resultData);
		result.setOk(true);
		return result;
	}
}
