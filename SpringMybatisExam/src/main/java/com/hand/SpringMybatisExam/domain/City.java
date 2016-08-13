package com.hand.SpringMybatisExam.domain;

import java.util.Date;

public class City {
	private Integer ct_id;
	private String city;
	private Integer c_id;
	private Date last_update;
	public Integer getCt_id() {
		return ct_id;
	}
	public void setCt_id(Integer ct_id) {
		this.ct_id = ct_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	public String toString() {
		return "city [ct_id=" + ct_id + ", city=" + city + ", c_id=" + c_id
				+ ", last_update=" + last_update + "]";
	}
	
	
	
}
