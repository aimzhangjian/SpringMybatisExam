package com.hand.SpringMybatisExam.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.hand.SpringMybatisExam.dao.StaffDao;
import com.hand.SpringMybatisExam.domain.Staff;
import com.hand.SpringMybatisExam.service.StaffService;


/**
 * 业务层注解
 * 
 * @author aim
 * 
 */
@Service("staffService")
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffDao staffdao;
	@Transactional()
	public void saveStaff(Staff t) {
		staffdao.saveStaff(t);
	}
	@Transactional()
	public void updateStaff(Staff t) {
		staffdao.updateStaff(t);
	}
	@Transactional()
	public void deleteStaff(Integer id) {
		staffdao.deleteStaff(id);
	}
	@Transactional()
	public Staff getStaffById(Integer id) {
		return staffdao.getStaffById(id);
	}
	@Transactional()
	public List<Staff> getStaffList() {
		return staffdao.getStaffList();
	}

	
	/**
	 * 校验用户是否存在
	 */
	@Transactional()
	public Staff validateLoginInfo(String userName, String password) {
		Map<String,String> paramMap=new HashMap<String, String>();
		paramMap.put("username",userName);
		paramMap.put("password",password);
		return staffdao.getStaff(paramMap);
	}
	@Transactional()
	public boolean isRegisted(String username) {
		Map<String,String> paramMap=new HashMap<String, String>();
		paramMap.put("username",username);
		Staff staff=staffdao.getStaff(paramMap);
		return staff!=null? true:false;
	}
	
	@Transactional()
	public int getCount(Object... objects) {
		// TODO Auto-generated method stub
		return 0;
	}

}
