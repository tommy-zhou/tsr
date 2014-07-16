package com.tsr.web.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tsr.api.bean.ProductGoods;
import com.tsr.api.service.ProductGoodsServiceApi;


@RequestMapping("goods")
public class ProductGoodsController extends BaseController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(ProductGoodsController.class);
	
	@Resource 
	private ProductGoodsServiceApi productGoodsService;
	
	@RequestMapping("/{productGoodsId}.htm")
	public ModelAndView placeOrder(HttpServletRequest request,
			@PathVariable Integer productGoodsId,
			ModelAndView mav){
		ProductGoods productGoods = productGoodsService.getAllInfo(productGoodsId);
		mav.addObject("productGoods", productGoods);
		mav.setViewName("goods_detail");
		return mav;
	
	}
}
