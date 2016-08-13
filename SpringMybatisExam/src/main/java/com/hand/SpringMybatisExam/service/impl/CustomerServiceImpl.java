package com.hand.SpringMybatisExam.service.impl;


import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.SpringMybatisExam.dao.CustomerDao;
import com.hand.SpringMybatisExam.domain.Customer;
import com.hand.SpringMybatisExam.service.CustomerService;


/**
 * 业务层注解
 * 
 * @author aim
 * 
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerdao;
	@Transactional()
	public int saveCustomer(Customer t) {
		int sign=customerdao.saveCustomer(t);
		int id = getNewId();

		Customer customer = getCustomerById(id);

		SimpleDateFormat simpleDate = new SimpleDateFormat(
				"yyyy-MM-dd hh:mm:ss");
        System.out.println("已经保存的数据如下:");
		System.out.println("Id:"+customer.getCustomer_id()+"    first_name:" + customer.getFirst_name()
				+ "   last_name:" + customer.getLast_name() + "   email:"
				+ customer.getEmail() + "   create_date:"
				+ simpleDate.format(customer.getCreate_date()));

		return sign;
	}

	
	@Transactional()
	public int getNewId() {
		int id=customerdao.getNewId();
		return id;
	}
	@Transactional()
	public Customer getCustomerById(int id){
		Customer customer=customerdao.getCustomerById(id);
		return customer;
	}


	@Transactional()
	@Override
	public int deleteCustomer(int id) {
		int sign=customerdao.deleteCustomer(id);
		return sign;
	}
	
}
