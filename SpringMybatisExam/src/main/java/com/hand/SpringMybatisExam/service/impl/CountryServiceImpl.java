package com.hand.SpringMybatisExam.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.SpringMybatisExam.dao.CountryDao;
import com.hand.SpringMybatisExam.service.CountryService;


/**
 * 业务层注解
 * 
 * @author aim
 * 
 */
@Service("countryService")
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryDao countrydao;

}
