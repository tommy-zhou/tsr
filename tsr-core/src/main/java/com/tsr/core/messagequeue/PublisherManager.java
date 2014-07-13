//package com.tsr.core.messagequeue;
//
//import java.lang.reflect.Type;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.tsr.api.domain.message.Message;
//import com.tsr.api.service.comm.PublisherServiceApi;
//import com.tsr.core.messagequeue.queue.Queue;
//
///**
// *  消息发布管理器
// * @author Tommy
// *
// */
//public class PublisherManager implements PublisherServiceApi {
//	private static final Logger logger = LoggerFactory.getLogger(PublisherManager.class);
//	
//	private List<Queue<Message>> queueList;
//	public void setQueueList(List<Queue<Message>> queueList) {
//		this.queueList = queueList;
//	}
//	/**
//	 * 通过消息类型    发布消息到  对应队列
//	 * @param message
//	 */
//	public void publish(Message message){
//		boolean published = false;
//		for(Queue<Message> queue : queueList){
//			Type[] types =queue.getClass().getGenericInterfaces();
//			if(types.length > 0){
//				if(types[0].toString().contains(message.getClass().getName())){
//					queue.push(message);
//					published = true;
//				}
//			}
//		}
//		if(!published){
//			logger.error("message publish failed!");
//		}
//		logger.debug(message.toString());
//	}
//	
//	/**
//	 * 通过队列名 发布消息
//	 * @param message
//	 * @param queueName
//	 */
//	public void publish(Message message,String queueName){
//		boolean published = false;
//		for(Queue<Message> queue : queueList){
//			if(queueName != null && queueName.equalsIgnoreCase(queue.getQueueName())){
//				queue.push(message);
//				published = true;
//			}
//		}
//		if(!published){
//			logger.error("message publish failed!");
//		}
//		logger.debug(message.toString());
//	}
//
//}
