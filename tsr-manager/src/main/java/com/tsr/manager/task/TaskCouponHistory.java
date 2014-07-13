//package com.rsos.manager.task;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.rsos.api.domain.basic.ServiceResult;
//import com.rsos.api.domain.user.Brand;
//import com.rsos.api.domain.user.Coupon;
//import com.rsos.api.service.user.CouponServiceApi;
//import com.rsos.comm.util.TaskManager;
//
//public class TaskCouponHistory {
//	@Resource
//	CouponServiceApi couponService;
//	
//	@Resource
//	private TaskManager taskManager;
//	
//	/**
//	 * Logger for this class
//	 */
//	private static final Logger logger = LoggerFactory.getLogger(TaskErpBrand.class);
//	
//	/**
//	 * 定时把过期的优惠劵转移coupon_history表中
//	 */
//	public void transferOverdueCoupon() {
//		try {
//			if (taskManager.isMasterNode()) {
//				logger.info("转移过期的优惠劵定时任务---start");
//				//查询出需要转移的过期的优惠劵，每次查询一万条
//				for (int i = 0; i < 1000; i++) {
//					int count=(i+1)*10000;
//					ServiceResult<List<Coupon>> result=couponService.getOverdueCouponList(10000);
//					List<Coupon> list=result.getData();
//					if(list.size()==0){
//						logger.info("没有过期的优惠劵");
//						break;
//					}else if(list.size()<10000){
//						count=i*10000+list.size();
//					}
//					if(list.size()>0){
//						ServiceResult<Boolean> insertResult=couponService.insertCouponHistory(list);
//						if(insertResult.isOk()){
//							logger.info("将第"+(i*10000+1)+"--"+count+"条过期的优惠劵导入coupon_history--success");
//							ServiceResult<Boolean> deleteResult=couponService.deleteOverdueCoupon(list);
//							if(deleteResult.isOk()){
//								logger.info("将第"+(i*10000+1)+"--"+count+"条过期的优惠劵从coupon表中移除--success");
//							}else{
//								logger.info("将第"+(i*10000+1)+"--"+count+"条过期的优惠劵从coupon表中移除--fail");
//							}
//						}else{
//							logger.info("将第"+(i*10000+1)+"--"+count+"条过期的优惠劵导入coupon_history--fail");
//						}
//					}
//				}
//				logger.info("转移过期的优惠劵定时任务---end");
//			}
//		} catch (Exception e) {
//			logger.error("转移过期的优惠劵定时任务异常");
//			e.printStackTrace();
//		}
//		
//	}
//
//}
//
