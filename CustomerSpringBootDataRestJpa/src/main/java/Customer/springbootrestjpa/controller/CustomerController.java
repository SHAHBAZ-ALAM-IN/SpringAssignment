package Customer.springbootrestjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Customer.springbootrestjpa.entities.Customer;
import Customer.springbootrestjpa.service.ICustomerService;

@RestController
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	@PostMapping("/addCustomer")
	public Customer addCustomer(Customer customer) {
		customer = new Customer("Camlin");
		customer = customerService.register(customer);
		return customer;
	}
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		List<Customer> customers = customerService.findAll();
		return customers;
	}

}
