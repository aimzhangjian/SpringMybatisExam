package com.hand.SpringMybatisExam.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.SpringMybatisExam.dao.AddressDao;
import com.hand.SpringMybatisExam.domain.Address;
import com.hand.SpringMybatisExam.service.AddressService;


/**
 * 业务层注解
 * 
 * @author aim
 * 
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDao addressdao;

	@Override
	public Address getAddressById(int id) {
		Address address =addressdao.getAddressById(id);
		return address;
	}

}
