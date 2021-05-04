package Business;

import Abstract.SalesService;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " bought a game: " + game.getName());
		
	}

	@Override
	public void sell(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " sold a game: " + game.getName());
		
	}

}