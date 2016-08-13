package com.hand.SpringMybatisExam.service;


import com.hand.SpringMybatisExam.domain.Customer;


public interface CustomerService{
	
    public int saveCustomer(Customer t);
    public int getNewId();
    public Customer getCustomerById(int id);
    public int deleteCustomer(int id);
}
