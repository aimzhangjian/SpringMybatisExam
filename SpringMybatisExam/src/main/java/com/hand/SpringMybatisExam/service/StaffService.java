package com.hand.SpringMybatisExam.service;

import java.util.List;

import com.hand.SpringMybatisExam.domain.Staff;


public interface StaffService{
	
    public void saveStaff(Staff t);
    public void updateStaff(Staff t);
    public void deleteStaff(Integer t);
   
    public Staff getStaffById(Integer id);
   
    public List<Staff> getStaffList();
    public int getCount(Object... objects);
    public Staff validateLoginInfo(String userName, String password);
    public boolean isRegisted(String username);
}
