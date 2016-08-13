package com.hand.SpringMybatisExam.testMain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hand.SpringMybatisExam.dao.CountryDao;
import com.hand.SpringMybatisExam.dao.CustomerDao;
import com.hand.SpringMybatisExam.dao.StaffDao;
import com.hand.SpringMybatisExam.domain.Customer;
import com.hand.SpringMybatisExam.domain.Film;
import com.hand.SpringMybatisExam.domain.Staff;
import com.hand.SpringMybatisExam.service.CustomerService;
import com.hand.SpringMybatisExam.service.FilmService;
import com.hand.SpringMybatisExam.service.StaffService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ApplicationContext.xml")
public class ForSMTest {

	@SuppressWarnings("restriction")
	@Resource
	private StaffService staffService;

	@SuppressWarnings("restriction")
	@Resource
	private CustomerService customerService;
	
	@SuppressWarnings("restriction")
	@Resource
	private FilmService filmService;

	/**
	 * 插入Customer
	 */
	@Test
	public void testAdd() {
		Customer c = new Customer();

		Scanner s = new Scanner(System.in);
		System.out.println("请输入Store_id:");
		c.setStore_id(s.nextInt());

		System.out.println("请输入First_name:");
		c.setFirst_name(s.next());

		System.out.println("请输入Last_name:");
		c.setLast_name(s.next());

		System.out.println("请输入Email:");
		c.setEmail(s.next());
		System.out.println("请输入Address_id:");
		c.setAddress_id(s.nextInt());
		c.setActive(1);
		Date date = new Date();
		long datetime = date.getTime();
		Timestamp timestamp = new Timestamp(datetime);

		c.setCreate_date(timestamp);
		c.setLast_update(timestamp);
		int sign = customerService.saveCustomer(c);

		int id = customerService.getNewId();

		Customer customer = customerService.getCustomerById(id);
		
		SimpleDateFormat simpleDate=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println("first_name:" + customer.getFirst_name()
				+ "   last_name:" + customer.getLast_name()
				+"   email:"+customer.getEmail()
				+"   create_date:"+simpleDate.format(customer.getCreate_date()));
	}

	@Test
	public void savefilm(){
		Film film=new Film();
		film.setTitle("fdsf");
		film.setDescription("fdsfdsf");
		film.setLanguage_id(1);
		
		int sign=filmService.saveFilm(film);
		System.out.println(sign);
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入customer id:");
		int sign1 = customerService.deleteCustomer(s.nextInt());
		while(sign1==0){
			System.out.println("请输入customer id:");
			sign1 = customerService.deleteCustomer(s.nextInt());
		}
		System.out.println("删除成功!");
	}
	
	
}
