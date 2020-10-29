package com.cg.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.cg.customer.dao.*;
import com.cg.customer.entities.Customer;
import com.cg.customer.util.ValidationUtil;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerDao dao;
	
	@Override
	public Customer register(Customer customer) {
	  ValidationUtil.checkArgumentNotNull(customer);
	  ValidationUtil.checkName(customer.getName()); 
	  customer=	dao.add(customer);
	   return customer;
	}
	

	@Override
	public Customer updateName(long id, String name) {
		Customer customer = dao.findById(id);
		customer.setName(name);
		customer = dao.update(customer);
		return customer;
	}

}