package Business;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("New game is added: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("New game is updated: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("New game is deleted: " + game.getName());
		
	}

}
