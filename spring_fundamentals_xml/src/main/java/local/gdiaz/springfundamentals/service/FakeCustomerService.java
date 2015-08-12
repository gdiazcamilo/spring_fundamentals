package local.gdiaz.springfundamentals.service;

import java.util.List;

import local.gdiaz.springfundamentals.model.Customer;
import local.gdiaz.springfundamentals.repository.*;

public class FakeCustomerService implements CustomerService {

	CustomerRepository customerRepository = new FakeCustomerRepository();
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
}
