package Customer.springbootrestjpa.service;

import java.util.List;

import Customer.springbootrestjpa.entities.Customer;

public interface ICustomerService {

	Customer register(Customer customer);

	Customer update(Customer customer);

	List<Customer> findAll();
}
