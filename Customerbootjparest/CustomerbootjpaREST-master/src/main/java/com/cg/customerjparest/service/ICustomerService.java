package com.cg.customerjparest.service;

import com.cg.customerjparest.entities.Customer;

public interface ICustomerService {

	Customer register(Customer customer);
	
	Customer updateName(long id,String name);

	Customer findById(long id);
	
}
