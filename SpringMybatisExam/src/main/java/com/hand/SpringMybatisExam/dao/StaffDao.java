package com.hand.SpringMybatisExam.dao;

import java.util.List;
import java.util.Map;

import com.hand.SpringMybatisExam.domain.Staff;



public interface StaffDao{
	int saveStaff(Staff staff);

	int deleteStaff(int id);

	int updateStaff(Staff staff);

	Staff getStaffById(int id);

	Staff getStaff(Map<String,String> paramMap);
	
	List<Staff> getStaffList();
}
