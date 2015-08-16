package local.gdiaz.springfundamentals.repository;

import java.util.List;

import local.gdiaz.springfundamentals.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();
}