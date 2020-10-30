package com.cg.customerjpa.dao;

import com.cg.customerjpa.entities.Customer;

public interface ICustomerDao {
	
    Customer add(Customer customer);
	
	Customer update(Customer customer);

	Customer findById(long id);
}
