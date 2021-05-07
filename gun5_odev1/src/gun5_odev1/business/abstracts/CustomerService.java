package gun5_odev1.business.abstracts;

import gun5_odev1.entities.concretes.Customer;

public interface CustomerService {
	
	void register(Customer customer);
	void login(Customer customer);
	
	
	Customer getById(int id);
	Customer getByEmail(String mail);
	
	

}
