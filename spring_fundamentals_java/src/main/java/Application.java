import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import local.gdiaz.springfundamentals.service.CustomerService;
import local.gdiaz.springfundamentals.service.FakeCustomerService;

public class Application {

	
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppContext.class);
		
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		customerService.setN(19);
		
		CustomerService customerService2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService2.getN());
		
		System.out.println(customerService.findAll().get(0).getFirstName());
		 
	}
}
