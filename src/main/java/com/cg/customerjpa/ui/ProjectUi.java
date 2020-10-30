package com.cg.customerjpa.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customerjpa.entities.Customer;
import com.cg.customerjpa.exceptions.CustomerNotFoundException;
import com.cg.customerjpa.exceptions.InvalidCustomerNameException;
import com.cg.customerjpa.service.ICustomerService;

@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service ;

	public void runUi() {
		try {

			Customer customer = add("Yash");
			long id1 = customer.getId();
			Customer customer2 = add("Shahbaz");
			long id2 = customer2.getId();
			Customer customer3 = add("PG");
			long id3 = customer3.getId();
			customer2=updateName(4, "Bhuratna");
			//System.out.println(customer2.getName());
		}
		catch (CustomerNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch (InvalidCustomerNameException e){
			System.out.println(e.getMessage());
		}

	}


	public Customer add(String name) {
		Customer customer = new Customer(name);
		customer = service.register(customer);
		System.out.println("Customer added with details, id=" + customer.getId() + " name=" + customer.getName());
		return customer;
	}
	public Customer updateName(long id,String name) {
		Customer customer = service.updateName(id,name);
		System.out.println("Customer details updated, id=" + customer.getId() + " name=" + customer.getName());
		return customer;
	}
}
