package gun5_odev1.business.concretes;

import gun5_odev1.business.abstracts.ValidationEmailService;

public class ValidationEmailManager implements ValidationEmailService {

	@Override
	public Boolean sendEmail() {
		
		System.out.println("Email adresinize do�rulama linki g�nderildi");
		return true;
	}

}
