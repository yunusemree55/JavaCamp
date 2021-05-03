package Adapter;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public Boolean chekIfRealCustomer(Customer customer) {
		
		KPSPublicSoapProxy kpsp = new KPSPublicSoapProxy();
		try {
			return  kpsp.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()) , customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getBirtOfDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}

}
