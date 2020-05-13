package com.hwj.demo.distribute.model;

import java.io.Serializable;

/**
 * @Auther: heweijian
 * @Date: 2020/5/7
 * @Description:
 */

//派单记录
public class ReceiverOrder implements Serializable {

	private static final long serialVersionUID = -2569670526204305052L;
	//编号
	private Long id;
	//接单人ID
	private Long ReceiverId;
	//订单ID
	private Long orderId;
	//接单时间
	private Long ReceiveOrderTime;
	//接单人级别
	private Integer receiverLevel;
	//业务状态
	private Integer status;
	//记录创建的的时间戳
	private Long dateCreated;
	//记录更新的的时间戳
	private Long lastUpdated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReceiverId() {
		return ReceiverId;
	}

	public void setReceiverId(Long receiverId) {
		ReceiverId = receiverId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getReceiveOrderTime() {
		return ReceiveOrderTime;
	}

	public void setReceiveOrderTime(Long receiveOrderTime) {
		ReceiveOrderTime = receiveOrderTime;
	}

	public Integer getReceiverLevel() {
		return receiverLevel;
	}

	public void setReceiverLevel(Integer receiverLevel) {
		this.receiverLevel = receiverLevel;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Long dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Long getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
