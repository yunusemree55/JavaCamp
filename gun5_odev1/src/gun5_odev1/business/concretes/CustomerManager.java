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
		
			hataMesajý();
			
		}if(customer.getPassword().length()<6) {
			
			System.out.println("Þifre uzunluðu en az 6 karakter olmalý");
			return;
		
		}
		
		
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(customer.getEmailAddress());
		
		if(!matcher.find()) {
			System.out.println("Email adresi geçersiz");
			return;
		}
		
		
		/*
		 * if(customerDao.getByEmail(customer.getEmailAddress()) != null){
		 * 
		 * System.out.println("Böyle e-posta zaten mevcut");
		 * return;
		 * 
		 * }
		 */
		 
		
		else {
		
		
		
		validationEmailService.sendEmail();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Email adresinizi doðruluyorsanýz 1'e basýnýz: ");
		int onayla = scanner.nextInt();
		
		if(onayla != 1) {
			
			System.out.println("Hesap oluþturulamadý");
			return;
			
		}
		else {
			
			customerDao.register(customer);
			System.out.println("Hesap oluþturuldu: " + customer.getFirstName());
			
		}
		
		
		}
		
		
		
	}

	@Override
	public void login(Customer customer) {
		
		if(customer.getEmailAddress().length() == 0 || customer.getPassword().length() == 0) {
			System.out.println("Giriþ yapma alanlarýný doldurunuz");
		}else {
			customerDao.login(customer);
			System.out.println("Sisteme baþarýyla giriþ yaptýnýz " + customer.getFirstName());
			
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
	
	private static void hataMesajý() {
		System.out.println("Kullanýcý bilgileri geçersiz");
	}

}
