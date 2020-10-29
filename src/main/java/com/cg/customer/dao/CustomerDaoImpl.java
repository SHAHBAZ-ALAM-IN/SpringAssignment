package com.cg.customer.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.customer.entities.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	private Map<Long, Customer> store = new HashMap<>();

	private long generatedId;

	long generateId() {
		++generatedId;
		return generatedId;
	}

	@Override
	public Customer add(Customer customer) {
		long id = generateId();
		customer.setId(id);
		store.put(id, customer);
		return customer;
	}
	
	@Override
	public Customer update(Customer customer) {
		Long  id = customer.getId();
		store.put(id, customer);
		return customer;
	}
	
	@Override
	public Customer findById(long id) {
		return store.get(id);
	}
}
