package local.gdiaz.springfundamentals.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import local.gdiaz.springfundamentals.model.Customer;

@Repository
public class FakeCustomerRepository implements CustomerRepository {

	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("Gustavo");
		customer.setLastName("Díaz");
		
		customers.add(customer);
		
		return customers;
		
	}
	
}
