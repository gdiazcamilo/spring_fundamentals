package local.gdiaz.springfundamentals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.gdiaz.springfundamentals.model.Customer;
import local.gdiaz.springfundamentals.repository.*;

@Service("customerService")
public class FakeCustomerService implements CustomerService {

	
	CustomerRepository customerRepository;
	
	@Autowired
	public FakeCustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
}
