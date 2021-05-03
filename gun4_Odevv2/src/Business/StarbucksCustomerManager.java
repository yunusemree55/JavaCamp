package Business;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService  customerCheckService;
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.chekIfRealCustomer(customer) == true) {
			
			super.save(customer);
			System.out.println("Customer is saved for Starbucks : " + customer.getFirstName());
			
			
		}else {
			System.out.println("This isn't a real person");
		}
		
	}
	

}
