package com.hand.SpringMybatisExam.service.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InsertFilmEvent {
	@Pointcut("execution(public int com.hand.SpringMybatisExam.service.impl.CustomerServiceImpl.saveCustomer(..))")
	public void declareJointExpression() {

	}

	@Before("declareJointExpression()")
	 public void BeforeInsertFilmEvent(JoinPoint joinPoint){
		   
		   System.out.println("Before Insert Customer Data.");
		   
	 }

	@After("declareJointExpression()")
	public void AfterInsertFilmEvent(JoinPoint joinPoint) {

		System.out.println("After Insert Customer Data");

	}

}
