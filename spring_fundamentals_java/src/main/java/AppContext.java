import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import local.gdiaz.springfundamentals.repository.CustomerRepository;
import local.gdiaz.springfundamentals.repository.FakeCustomerRepository;
import local.gdiaz.springfundamentals.service.CustomerService;
import local.gdiaz.springfundamentals.service.FakeCustomerService;

@Configuration
@ComponentScan("local.gdiaz.springfundamentals")
@PropertySource("app.properties")
@Scope("singleton")
public class AppContext {

	@Bean
	public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
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
