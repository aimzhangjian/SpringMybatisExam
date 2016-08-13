package com.hand.SpringMybatisExam.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.SpringMybatisExam.dao.CityDao;
import com.hand.SpringMybatisExam.service.CityService;


/**
 * 业务层注解
 * 
 * @author aim
 * 
 */
@Service("cityService")
public class CityServiceImpl implements CityService {
	@Autowired
	private CityDao Citydao;


}
