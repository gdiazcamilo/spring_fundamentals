package local.gdiaz.springfundamentals.service;

import java.util.List;

import local.gdiaz.springfundamentals.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

	void setN(int n);
	int getN();
	
}