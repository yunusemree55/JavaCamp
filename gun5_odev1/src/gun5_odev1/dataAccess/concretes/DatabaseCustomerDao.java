package gun5_odev1.dataAccess.concretes;

import java.util.List;

import gun5_odev1.dataAccess.abstracts.CustomerDao;
import gun5_odev1.entities.concretes.Customer;

public class DatabaseCustomerDao implements CustomerDao {
	
	List<Customer> customers;

	

	@Override
	public Customer getById(int id) {
		
		for(Customer customer:customers) {
			
			if(customer.getId() == id) { 
			
				return customer;
			}
		}
		
		return null;
	}

	@Override
	public Customer getByEmail(String email) {
		
		for(Customer customer:customers) {
			
			if(customer.getEmailAddress() == email) {
				
				return customer;
			}
		}
		
		return null;
	}

	@Override
	public void register(Customer customer) {
		System.out.println("Sisteme kayýt olundu: " + customer.getFirstName());
		
	}

	@Override
	public void login(Customer customer) {
		System.out.println("Sisteme giriþ yapýldý: " + customer.getFirstName());
		
	}

}
