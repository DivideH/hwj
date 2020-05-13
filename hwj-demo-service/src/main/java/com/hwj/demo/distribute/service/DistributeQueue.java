package com.hwj.demo.distribute.service;

import com.hwj.demo.distribute.common.DistributeContent;
import com.hwj.demo.distribute.model.Receiver;
import com.hwj.demo.distribute.model.ReceiverOrder;
import com.hwj.demo.distribute.repository.ReceiverOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @Auther: heweijian
 * @Date: 2020/5/7
 * @Description:
 */
public class DistributeQueue {

	@Autowired
	private ReceiverOrderRepository receiverOrderRepository;

	private static final Map<Integer, Queue<Receiver>> receiverMap = new HashMap<>();

	private static final Queue<Receiver> receiverQueue = new LinkedList<Receiver>();

	//功能需求：级别内人员平均分配订单，并所有人都能接到单
	//思想思路：1.为保证级别内所有人能接到订单，选用queue队列数据结构，实现类为linkedList,先进先出的形式保证每个人员获取到订单，以分发或后到人员会添加到队列的尾部
//	           2.以Map<Integer, Queue<Receiver>>数据结构将队列人员按照级别level分类管理
	//         3.伪代码实现思路如下

	/**
	 * 订单分派人员方法
	 * @param orderId
	 * @return
	 */
	public ReceiverOrder distributeOrder(Long orderId) {
		//按照2：4：6比例获取分配人员的级别
		Integer level = orderDistributeLevel();
		//获取级别中的队列数据
		Queue<Receiver> receivers = receiverMap.get(level);
		//获取队列中第一个（头部）的人员信息，并且从队列头部删除。注意：为空情况暂时不考虑
		Receiver receiver = receivers.poll();
		//分发订单给该人员，并且保存分发记录与receiverOrder表
//		ReceiverOrder receiverOrder = distributeOrder(receiver, orderId);
		//将以分发到的人员添加到队列的尾部
		receivers.offer(receiver);
		//返回分发记录信息
		return null;
	}



    //需求：运营需要查询每日接单数据，以及历史接单数据
	//实现思路：将订单分派记录持久化，并且记录每条记录的生成时间，便可实现每日接单数据查询，以及历史数据查询

	/**
	 * 订单分派给人员记录方法
	 * @param receiver
	 * @param orderId
	 * @return
	 */
//	public ReceiverOrder distributeOrder(Receiver receiver, Long orderId) {
//		//新建分派记录实体
//		ReceiverOrderEntity receiverOrderEntity = new ReceiverOrderEntity();
//		//分派人员ID
//		receiverOrderEntity.setReceiverId(receiver.getId());
//		//订单ID
//		receiverOrderEntity.setOrderId(orderId);
//		//分派人员级别
//		receiverOrderEntity.setReceiverLevel(receiver.getLevel());
//		//分派时间
//		receiverOrderEntity.setReceiveOrderTime(System.currentTimeMillis());
//		//数据持久化
//		ReceiverOrderEntity save = receiverOrderRepository.save(receiverOrderEntity);
//		return entity2Model(save);
//	}

	/**
	 * 分发级别
	 *
	 * @return
	 */
	public static Integer orderDistributeLevel() {
		Integer random = getRandom();
		if (random < 2) {
			return DistributeContent.DISTRIBUTE_LEVEL_ONE;
		} else if (random <= 5) {
			return DistributeContent.DISTRIBUTE_LEVEL_TWO;
		} else {
			return DistributeContent.DISTRIBUTE_LEVEL_THREE;
		}
	}

	/**
	 * @return 0-12之间的随机数
	 */
	public static Integer getRandom() {
		Random random = new Random();
		return random.nextInt(12);
	}
}
