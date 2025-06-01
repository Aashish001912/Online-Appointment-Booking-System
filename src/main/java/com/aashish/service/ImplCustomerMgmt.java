package com.aashish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aashish.entity.Customer;
import com.aashish.repository.CustomerRepository;
@Service
public class ImplCustomerMgmt implements CustomerIMgmtService {
	
	@Autowired
	private CustomerRepository custRepo;

	@Override
	public String bookAppointment(Customer customer) {
		Customer savedcustomer=custRepo.save(customer);
		return savedcustomer+" Hello Mr:"+savedcustomer.getCname()+" Your Appoitment is Confirmed...  and your ID is "+savedcustomer.getCid();
	}

}
