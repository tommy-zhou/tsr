//package com.rsos.core.messagequeue.queue.impl;
//
//import javax.annotation.Resource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//
//import com.rsos.api.domain.message.OrderShipmentMessage;
//import com.rsos.core.messagequeue.queue.Queue;
//
//public class UpdateOrderShipmentTrackSyncMessageQueue implements Queue<OrderShipmentMessage> {
//	
//	private static final Logger logger = LoggerFactory.getLogger(UpdateOrderShipmentTrackSyncMessageQueue.class);
//	
//	private final static String queueName = "updateOrderShipmentTrackQueue"; 
//	@Resource
//	private RedisTemplate<String,OrderShipmentMessage> redisTemplate;
//	
//	@Override
//	public void push(OrderShipmentMessage message) {
//		synchronized(queueName) {
//			try{
//				boolean needPush = true;
//				if(needPush){
//					redisTemplate.opsForList().leftPush(queueName, message);
//				}
//			}catch(Exception e){
//				logger.error("发布失败message:"+message.toString(), e);
//			}
//		}
//	}
//	
//	@Override
//	public OrderShipmentMessage pop(){
//		OrderShipmentMessage message = null;
//		synchronized(queueName) {
//			try{
//				message = redisTemplate.opsForList().rightPop(queueName);
//			}catch(Exception e){
//				logger.error("获取消息失败", e);
//			}
//		}
//		return message;
//	}
//
//	@Override
//	public String getQueueName() {
//		return queueName;
//	}
//
//}
