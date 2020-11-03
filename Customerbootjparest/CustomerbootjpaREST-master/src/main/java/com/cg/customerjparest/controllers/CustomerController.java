package com.cg.customerjparest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import com.cg.customerjparest.dto.CreateCustomerRequest;
import com.cg.customerjparest.dto.CustomerDetails;
import com.cg.customerjparest.dto.UpdateCustomerRequest;
import com.cg.customerjparest.entities.Customer;
import com.cg.customerjparest.service.ICustomerService;

@RequestMapping("/customer")
@RestController
public class CustomerController {
	
	 @Autowired
	    private ICustomerService service;
	 
	 @ResponseStatus(HttpStatus.CREATED)
	    @PostMapping("/add")
	 public CustomerDetails add(@RequestBody CreateCustomerRequest requestData) {
		 Customer customer=new Customer(requestData.getName());
		 customer=service.register(customer);
		 CustomerDetails details= toDetails(customer);
		return details;
	 }
	 

	    @PutMapping("/update")
	    public CustomerDetails update(@RequestBody UpdateCustomerRequest requestData) {
	    	Customer customer = new Customer(requestData.getName());
	    	customer.setId(requestData.getId());
	    	customer = service.updateName(customer.getId(),customer.getName());
	        CustomerDetails details = toDetails(customer);
	        return details;
	    }


	    @GetMapping("/get/{id}")
	    public CustomerDetails fetchCustomer(@PathVariable("id") long id) {
	    	Customer customer = service.findById(id);
	        CustomerDetails details = toDetails(customer);
	        return details;
	    }
	    
		public CustomerDetails toDetails(Customer customer) {
			CustomerDetails details=new CustomerDetails(customer.getId(),customer.getName());
			return details;
		}
}
