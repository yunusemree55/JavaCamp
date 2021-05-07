package gun5_odev1.core.abstracts;

import gun5_odev1.entities.concretes.Customer;

public interface GoogleService {
	
	void register(Customer customer);
	void login(Customer customer);

}
