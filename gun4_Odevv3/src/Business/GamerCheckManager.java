package Business;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public Boolean checkIfRealPerson(Gamer gamer) {
		if( gamer.getNationalIdentity().length()== 11  ) {
			
			System.out.println("Verification Successful");
			return true;
			
		}else {
		
			System.out.println("Verification Unsuccessful");
			return false;
		}
	}

}