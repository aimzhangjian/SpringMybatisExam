package com.hand.SpringMybatisExam.testMain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hand.SpringMybatisExam.domain.Address;
import com.hand.SpringMybatisExam.domain.Customer;
import com.hand.SpringMybatisExam.domain.Film;
import com.hand.SpringMybatisExam.service.AddressService;
import com.hand.SpringMybatisExam.service.CustomerService;
import com.hand.SpringMybatisExam.service.FilmService;
import com.hand.SpringMybatisExam.service.StaffService;

public class ForMain {

	public static void main(String[] arg) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		CustomerService customerService = (CustomerService) ctx
				.getBean("customerService");

		FilmService filmService = (FilmService) ctx.getBean("filmService");

		AddressService addressService = (AddressService) ctx
				.getBean("addressService");

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
		int address_id = s.nextInt();

		Address address = addressService.getAddressById(address_id);
    
		while(address == null) {
			System.out.println("请输入Address_id:");
			address_id = s.nextInt();
			address = addressService.getAddressById(address_id);
		}
        System.out.println(address_id);
		
		c.setAddress_id(address_id);
		c.setActive(1);
		Date date = new Date();
		long datetime = date.getTime();
		Timestamp timestamp = new Timestamp(datetime);

		c.setCreate_date(timestamp);
		c.setLast_update(timestamp);
		int sign = customerService.saveCustomer(c);

		System.out.println("请输入要删除customer id:");
		int sign1 = customerService.deleteCustomer(s.nextInt());
		while (sign1 == 0) {
			System.out.println("请输入customer id:");
			sign1 = customerService.deleteCustomer(s.nextInt());
		}
		System.out.println("删除成功!");

	}

}
