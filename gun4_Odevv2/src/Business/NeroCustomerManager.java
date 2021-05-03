package Business;

import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	@Override
	public void save(Customer customer) {
		
		System.out.println("Customer is saved for Nero : " + customer.getFirstName());
		
	}

}
