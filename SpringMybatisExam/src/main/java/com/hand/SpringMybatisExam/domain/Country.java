package com.hand.SpringMybatisExam.domain;

import java.util.Date;
import java.util.List;

public class Country {
	private Integer c_id;
	private String country;
	private Date last_update;
	private List<City> cityList;
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	@Override
	public String toString() {
		return "Country [c_id=" + c_id + ", country=" + country
				+ ", last_update=" + last_update + ", cityList=" + cityList
				+ "]";
	}

	
	
}
