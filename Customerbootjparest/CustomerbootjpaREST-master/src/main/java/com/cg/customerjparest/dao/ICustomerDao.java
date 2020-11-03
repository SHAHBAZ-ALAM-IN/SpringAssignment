package com.cg.customerjparest.dao;

import com.cg.customerjparest.entities.Customer;

public interface ICustomerDao {
	
    Customer add(Customer customer);
	
	Customer update(Customer customer);

	Customer findById(long id);
}
