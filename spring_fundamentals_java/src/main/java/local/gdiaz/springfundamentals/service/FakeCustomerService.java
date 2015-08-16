package local.gdiaz.springfundamentals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import local.gdiaz.springfundamentals.model.Customer;
import local.gdiaz.springfundamentals.repository.*;

public class FakeCustomerService implements CustomerService {

	
	CustomerRepository customerRepository;

	private int n;
	
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public FakeCustomerService() {
		
	}
	
	public FakeCustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
