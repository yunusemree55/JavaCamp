package gun5_odev1.core.concretes;

import gun5_odev1.core.abstracts.GoogleService;
import gun5_odev1.entities.concretes.Customer;
import gun5_odev1.google.GoogleCustomerManager;

public class GoogleCustomerManagerAdapter implements GoogleService {
	
	
	@Override
	public void register(Customer customer) {
		
		GoogleCustomerManager googleCustomerManager = new GoogleCustomerManager();
		googleCustomerManager.register(customer.getEmailAddress(),customer.getPassword());
		
	}

	@Override
	public void login(Customer customer) {
		
		GoogleCustomerManager googleCustomerManager = new GoogleCustomerManager();
		googleCustomerManager.login(customer.getEmailAddress(),customer.getPassword());
		
	}

}
