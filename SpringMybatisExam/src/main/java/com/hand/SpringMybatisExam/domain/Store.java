package com.hand.SpringMybatisExam.domain;

import java.util.Date;

public class Store {
	private Integer storeid;
	private Integer manager_staff_id;
	private Integer address_id;
	private Date last_update;
	
	public Integer getStoreid() {
		return storeid;
	}
	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}
	public Integer getManager_staff_id() {
		return manager_staff_id;
	}
	public void setManager_staff_id(Integer manager_staff_id) {
		this.manager_staff_id = manager_staff_id;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	public String toString() {
		return "Store [storeid=" + storeid + ", manager_staff_id="
				+ manager_staff_id + ", address_id=" + address_id
				+ ", last_update=" + last_update + "]";
	}
	
	
	
}
