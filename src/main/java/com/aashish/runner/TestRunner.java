package com.aashish.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aashish.entity.Customer;
import com.aashish.service.ImplCustomerMgmt;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ImplCustomerMgmt custService;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			Customer c1=new Customer("Rahul","Hyd",348765l,"r@mail.com");
			String msg=custService.bookAppointment(c1);
			System.out.println(msg);
			
		}
		catch (Exception e) {
         e.printStackTrace();
		}
	}

}
