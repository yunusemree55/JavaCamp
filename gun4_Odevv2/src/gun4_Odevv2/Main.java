package gun4_Odevv2;

import Adapter.MernisServiceAdapter;
import Business.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		

			Customer customer1 = new Customer();
			customer1.setId(1);
			customer1.setFirstName("Yunus Emre");
			customer1.setLastName("Çiçek");
			customer1.setNationalIdentity("12345678910");
			customer1.setBirtOfDate(2001);
			
			StarbucksCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
			
			customerManager.save(customer1);
	 		
	}

}
