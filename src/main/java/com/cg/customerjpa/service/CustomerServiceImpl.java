package com.cg.customerjpa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.customerjpa.dao.ICustomerDao;
import com.cg.customerjpa.entities.Customer;
import com.cg.customerjpa.util.ValidationUtil;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService {
    private static final Logger Log= LoggerFactory.getLogger(CustomerServiceImpl.class);
    @Autowired
    private ICustomerDao dao;


    @Override
    public Customer register(Customer customer) {
        ValidationUtil.checkArgumentNotNull(customer);
        ValidationUtil.checkName(customer.getName());
        customer = dao.add(customer);
        return customer;
    }


	@Override
	public Customer updateName(long id, String name) {
		Customer customer=dao.findById(id);
		customer.setName(name);
		ValidationUtil.checkName(customer.getName());
        customer=dao.update(customer);
        return customer;
	}



}
