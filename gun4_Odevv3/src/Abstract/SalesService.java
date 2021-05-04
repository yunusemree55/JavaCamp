package Abstract;

import Entities.Game;
import Entities.Gamer;

public interface SalesService {
	
	void buy(Gamer gamer,Game game);
	void sell(Gamer gamer,Game game);

}
