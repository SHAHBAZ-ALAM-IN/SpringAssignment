package com.cg.customerjpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cg.customerjpa.entities.Customer;
import com.cg.customerjpa.exceptions.CustomerNotFoundException;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
   private static final Logger Log= LoggerFactory.getLogger(CustomerDaoImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Customer add(Customer customer) {
        entityManager.persist(customer);
		return customer;
	}
    @Override
    public Customer findById(long id) throws CustomerNotFoundException{

        Customer customer = entityManager.find(Customer.class, id);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer not found for id=" + id);
        }
        return customer;
    }

   @Override
    public Customer update(Customer customer) throws CustomerNotFoundException{
        boolean success=checkExists(customer.getId());
        if(!success){
            throw new CustomerNotFoundException("Can't update, customer doesn't exist for id="+customer.getId());
        }
        customer = entityManager.merge(customer);
        return customer;
    }

    public boolean checkExists(long id){
    	Customer customer = entityManager.find(Customer.class, id);
        boolean result= customer!=null;
        return result;
    }



}
