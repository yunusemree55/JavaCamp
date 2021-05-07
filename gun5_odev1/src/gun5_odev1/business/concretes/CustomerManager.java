package gun5_odev1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

import gun5_odev1.business.abstracts.CustomerService;
import gun5_odev1.business.abstracts.ValidationEmailService;
import gun5_odev1.core.abstracts.GoogleService;
import gun5_odev1.dataAccess.abstracts.CustomerDao;
import gun5_odev1.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private ValidationEmailService validationEmailService;
	private GoogleService googleService;
	
	
	
	
	public CustomerManager(CustomerDao customerDao,ValidationEmailService validationEmailService) {
		super();
		this.customerDao = customerDao;
		this.validationEmailService = validationEmailService;
		
	}
	
	
	
	
	
	@Override
	public void register(Customer customer) {
		
		if(customer.getFirstName().length()< 2 || customer.getLastName().length()<2) {
		
			hataMesaj�();
			
		}if(customer.getPassword().length()<6) {
			
			System.out.println("�ifre uzunlu�u en az 6 karakter olmal�");
			return;
		
		}
		
		
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(customer.getEmailAddress());
		
		if(!matcher.find()) {
			System.out.println("Email adresi ge�ersiz");
			return;
		}
		
		
		/*
		 * if(customerDao.getByEmail(customer.getEmailAddress()) != null){
		 * 
		 * System.out.println("B�yle e-posta zaten mevcut");
		 * return;
		 * 
		 * }
		 */
		 
		
		else {
		
		
		
		validationEmailService.sendEmail();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Email adresinizi do�ruluyorsan�z 1'e bas�n�z: ");
		int onayla = scanner.nextInt();
		
		if(onayla != 1) {
			
			System.out.println("Hesap olu�turulamad�");
			return;
			
		}
		else {
			
			customerDao.register(customer);
			System.out.println("Hesap olu�turuldu: " + customer.getFirstName());
			
		}
		
		
		}
		
		
		
	}

	@Override
	public void login(Customer customer) {
		
		if(customer.getEmailAddress().length() == 0 || customer.getPassword().length() == 0) {
			System.out.println("Giri� yapma alanlar�n� doldurunuz");
		}else {
			customerDao.login(customer);
			System.out.println("Sisteme ba�ar�yla giri� yapt�n�z " + customer.getFirstName());
			
		}
		
	}

	@Override
	public Customer getById(int id) {
		
		return customerDao.getById(id);
	}

	@Override
	public Customer getByEmail(String mail) {
		
		return customerDao.getByEmail(mail);
	}
	
	
	
	
	//--------------------------------------------------------------------------------------------------------------------------------------
	
	private static void hataMesaj�() {
		System.out.println("Kullan�c� bilgileri ge�ersiz");
	}

}
