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
//import com.rsos.api.domain.message.OrderShipmentMessage;
//import com.rsos.api.domain.message.TaskOrderMessage;
//import com.rsos.api.domain.order.OrderShipment;
//import com.rsos.api.service.comm.PublisherServiceApi;
//import com.rsos.api.service.task.UpdateOrderShipmentTrackServiceApi;
//import com.rsos.comm.constants.CommonConstants;
//import com.rsos.core.messagequeue.consumer.QueueConsumer;
//
//public class UpdateOrderShipmentTrackSyncMessageQueueConsumer extends QueueConsumer<OrderShipmentMessage>{
//	
//	private static final Logger logger = LoggerFactory
//			.getLogger(UpdateOrderShipmentTrackSyncMessageQueueConsumer.class);
//
//	@Resource
//	private RedisTemplate<String, OrderShipment> redisTemplate;
//
//	@Resource
//	private PublisherServiceApi publisherManager;
//	
//	@Resource
//	private UpdateOrderShipmentTrackServiceApi updateOrderShipmentTrackService;
//	
//	/**该方法已废弃，不再使用
//	 * 直接在定时任务中处理
//	 */
//	@Override
//	protected void consume(List<OrderShipmentMessage> list) {
//		logger.error("该方法已废弃，不再使用");
///*		for (OrderShipmentMessage message : list) {
//			// 验查渠道组是否已经正在同步
//			boolean exist = redisTemplate.opsForSet().isMember(
//					CommonConstants.UPDATE_ORDERSHIPMENT_TRACK_GROUP_SET, message.getOrderShipment());
//			if (exist) {
//				logger.debug("要处理的orderShipmentSn:" + message.getOrderShipment().getOrderShipmentSn() + ",等待下一轮，重新放入队列");
//				publisherManager.publish(message);
//				continue;
//			}
//			try {
//				// 添加渠道组到当前同步列表中
//				redisTemplate.opsForSet().add(
//						CommonConstants.UPDATE_ORDERSHIPMENT_TRACK_GROUP_SET,
//						message.getOrderShipment());
//				// TODO 具体业务
//				//队列中需要处理的逻辑：1，调用拆单方法拆单 2将拆单结果发送给ERP
//				logger.info("正在获取快递在途信息 ordershipment_sn:"+message.getOrderShipment().getOrderShipmentSn());
//				updateOrderShipmentTrackService.updateOrderShipmentTrack(message.getOrderShipment());
//				logger.info("获取快递在途信息结束");
//				
//			} catch (Exception e) {
//				logger.error(
//						"快递单号 加入队列错误orderShipmentSn:" + message.getOrderShipment().getOrderShipmentSn() + " sync item ERROR.", e);
//			} finally {
//				// 同步结束，把渠道组从当前同步列表中去掉
//				redisTemplate.opsForSet().remove(
//						CommonConstants.UPDATE_ORDERSHIPMENT_TRACK_GROUP_SET,
//						message.getOrderShipment());
//			}
//		}
//*/
//	}
//
//	@Override
//	public void initData() {
//		redisTemplate.delete(CommonConstants.UPDATE_ORDERSHIPMENT_TRACK_GROUP_SET);
//	}
//	
//
//}
