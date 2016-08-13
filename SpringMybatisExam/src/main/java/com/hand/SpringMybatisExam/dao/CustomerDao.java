package com.hand.SpringMybatisExam.dao;


import com.hand.SpringMybatisExam.domain.Customer;



public interface CustomerDao{
	int saveCustomer(Customer customer);
  
	int getNewId();
	
	Customer getCustomerById(int id);
	
	int deleteCustomer(int id);
}
