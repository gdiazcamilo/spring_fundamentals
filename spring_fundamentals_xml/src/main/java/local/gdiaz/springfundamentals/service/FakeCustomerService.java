package local.gdiaz.springfundamentals.service;

import java.util.List;

import local.gdiaz.springfundamentals.model.Customer;
import local.gdiaz.springfundamentals.repository.*;

public class FakeCustomerService implements CustomerService {

	CustomerRepository customerRepo;
	
	public FakeCustomerService() {
	
	}
	
	public FakeCustomerService(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepo = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	
}
