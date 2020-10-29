package com.cg.customer.service;

import com.cg.customer.entities.Customer;

public interface ICustomerService {

    Customer register(Customer customer);
	
	Customer updateName(long id,String name);
	
}