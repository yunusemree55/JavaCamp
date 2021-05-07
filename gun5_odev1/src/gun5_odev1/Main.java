package gun5_odev1;


import gun5_odev1.business.concretes.CustomerManager;
import gun5_odev1.business.concretes.ValidationEmailManager;
import gun5_odev1.core.concretes.GoogleCustomerManagerAdapter;
import gun5_odev1.dataAccess.concretes.DatabaseCustomerDao;
import gun5_odev1.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Yunus","Çiçek","abbc123@gmail.com","234356");
		
		CustomerManager customerManager = new CustomerManager(new DatabaseCustomerDao(),new ValidationEmailManager());
		
		customerManager.register(customer1);
		customerManager.login(customer1);
		
		
		 
	}

}