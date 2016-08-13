package com.hand.SpringMybatisExam.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.SpringMybatisExam.dao.CityDao;
import com.hand.SpringMybatisExam.dao.FilmDao;
import com.hand.SpringMybatisExam.domain.Film;
import com.hand.SpringMybatisExam.service.CityService;
import com.hand.SpringMybatisExam.service.FilmService;


/**
 * 业务层注解
 * 
 * @author aim
 * 
 */
@Service("filmService")
public class FilmServiceImpl implements FilmService {
	@Autowired
	private FilmDao filmdao;
	@Transactional()
	public int saveFilm(Film film) {
		int sign=filmdao.saveFilm(film);
		return sign;
	}


}
