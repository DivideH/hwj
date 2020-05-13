package com.hwj.demo.distribute.model;

import java.io.Serializable;

/**
 * @Auther: heweijian
 * @Date: 2020/5/7
 * @Description:
 */

//接单人员
public class Receiver implements Serializable {

	private static final long serialVersionUID = 1780580524259515744L;
	//人员编号
	private Long id;
	//人员级别
	private Integer level;
	//人员业务状态,默认1 有效
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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
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
