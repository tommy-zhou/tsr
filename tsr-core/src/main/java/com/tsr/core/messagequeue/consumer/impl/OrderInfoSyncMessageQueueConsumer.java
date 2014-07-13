//package com.rsos.core.messagequeue.consumer.impl;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//
//import com.rsos.api.domain.message.TaskOrderMessage;
//import com.rsos.api.service.comm.PublisherServiceApi;
//import com.rsos.api.service.task.SplitOrderServiceApi;
//import com.rsos.comm.constants.CommonConstants;
//import com.rsos.core.messagequeue.consumer.QueueConsumer;
//
//public class OrderInfoSyncMessageQueueConsumer extends
//		QueueConsumer<TaskOrderMessage> {
//
//	private static final Logger logger = LoggerFactory
//			.getLogger(OrderInfoSyncMessageQueueConsumer.class);
//
//	@Resource
//	private RedisTemplate<String, String> redisTemplate;
//
//	@Resource
//	private PublisherServiceApi publisherManager;
//	
//	@Resource
//	private SplitOrderServiceApi splitOrderService;
//	
//
//	@Override
//	protected void consume(List<TaskOrderMessage> list) {
//		for (TaskOrderMessage message : list) {
//			// 验查渠道组是否已经正在同步
//			boolean exist = redisTemplate.opsForSet().isMember(
//					CommonConstants.SPLIT_THEN_SEND_ERP_GROUP_SET, message.getOrderSn());
//			if (exist) {
//				logger.debug("要处理的订单号OrderSn:" + message.getOrderSn() + ",等待下一轮，重新放入队列");
//				publisherManager.publish(message);
//				continue;
//			}
//			try {
//				// 添加渠道组到当前同步列表中
//				redisTemplate.opsForSet().add(
//						CommonConstants.SPLIT_THEN_SEND_ERP_GROUP_SET,
//						message.getOrderSn());
//				// TODO 具体业务
//				//队列中需要处理的逻辑：1，调用拆单方法拆单 2将拆单结果发送给ERP
//				logger.info("TaskOrderInfo: 正在拆单.....OrderSn:"+message.getOrderSn());
//				
//				//splitOrder(message.getOrderSn());
//				splitOrderService.splitOrder(message.getOrderSn());
//				
//				logger.info("TaskOrderInfo: 拆单结束.....OrderSn:");
//				logger.info("TaskOrderInfo: 将拆单结果发给ERP.....");
//				//logger.info("标志订单拆单状态：已经过拆单");
//				//logger.info("TaskOrderInfo: 修改订单状态.....");
//				logger.info("TaskOrderInfo: 执行完毕.....");
//			} catch (Exception e) {
//				logger.error(
//						"订单号加入队列错误OrderSn:" + message.getOrderSn() + " sync item ERROR.", e);
//			} finally {
//				// 同步结束，把渠道组从当前同步列表中去掉
//				redisTemplate.opsForSet().remove(
//						CommonConstants.SPLIT_THEN_SEND_ERP_GROUP_SET,
//						message.getOrderSn());
//			}
//		}
//
//	}
//
//	@Override
//	public void initData() {
//		redisTemplate.delete(CommonConstants.SPLIT_THEN_SEND_ERP_GROUP_SET);
//	}
//	
//	
//	
//	 
//	 
//	 
//}
