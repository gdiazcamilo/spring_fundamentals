import local.gdiaz.springfundamentals.service.CustomerService;
import local.gdiaz.springfundamentals.service.FakeCustomerService;

public class Application {

	
	public static void main(String[] args) {
		CustomerService customerService = new FakeCustomerService();
		
		System.out.println(customerService.findAll().get(0).getFirstName());
		 
	}
}
