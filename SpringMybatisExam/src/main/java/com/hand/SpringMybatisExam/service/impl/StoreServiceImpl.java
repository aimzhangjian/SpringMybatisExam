package com.hand.SpringMybatisExam.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.SpringMybatisExam.dao.StoreDao;
import com.hand.SpringMybatisExam.service.StoreService;


/**
 * 业务层注解
 * 
 * @author aim
 * 
 */
@Service("storeService")
public class StoreServiceImpl implements StoreService {
	@Autowired
	private StoreDao Storedao;

	

}
