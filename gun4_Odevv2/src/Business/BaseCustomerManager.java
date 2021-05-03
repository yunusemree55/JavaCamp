package Business;

import Abstract.CustomerService;
import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Save to database: " + customer.getFirstName());
		
	}

}
