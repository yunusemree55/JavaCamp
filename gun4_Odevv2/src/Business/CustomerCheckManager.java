package Business;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Boolean chekIfRealCustomer(Customer customer) {
		
		
		return true;
	}

}