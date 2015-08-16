import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import local.gdiaz.springfundamentals.repository.CustomerRepository;
import local.gdiaz.springfundamentals.repository.FakeCustomerRepository;
import local.gdiaz.springfundamentals.service.CustomerService;
import local.gdiaz.springfundamentals.service.FakeCustomerService;

@Configuration
@ComponentScan("local.gdiaz.springfundamentals")
public class AppContext {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		FakeCustomerService customerService = new FakeCustomerService();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}

	private CustomerRepository getCustomerRepository() {
		return new FakeCustomerRepository();
	}
	
	
}
