package gun5_odev1.dataAccess.abstracts;

import gun5_odev1.entities.concretes.Customer;

public interface CustomerDao {
	
	void register(Customer customer);
	void login(Customer customer);
	
	
	Customer getById(int id);
	Customer getByEmail(String email);
	
}
