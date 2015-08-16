package local.gdiaz.springfundamentals.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import local.gdiaz.springfundamentals.model.Customer;

@Repository
public class FakeCustomerRepository implements CustomerRepository {

	@Value("${myName}")
	private String myName;
	
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName(myName);
		customer.setLastName("Díaz");
		
		customers.add(customer);
		
		return customers;
		
	}
	
}
