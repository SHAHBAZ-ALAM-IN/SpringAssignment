package com.cg.customerjpa.service;

import com.cg.customerjpa.entities.Customer;

public interface ICustomerService {

	Customer register(Customer customer);
	
	Customer updateName(long id,String name);
	
}
