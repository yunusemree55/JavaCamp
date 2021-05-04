package Business;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;


	public GamerManager(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer) == true) {
			System.out.println("New gamer added: " + gamer.getFirstName());
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("gamer information is updated: " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer is deleted: " + gamer.getFirstName());
		
	}

	@Override
	public void addMoney(Gamer gamer,double amount) {
		System.out.println(gamer.getFirstName() +" added money: " + amount);
		
	}

}
