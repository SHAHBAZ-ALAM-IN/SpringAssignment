package Customer.springbootrestjpa.dao;

import org.springframework.data.repository.CrudRepository;

import Customer.springbootrestjpa.entities.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Long>{

}
