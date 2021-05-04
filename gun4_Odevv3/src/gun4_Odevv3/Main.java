package gun4_Odevv3;

import java.time.LocalDate;

import Business.CampaignManager;
import Business.GameManager;
import Business.GamerCheckManager;
import Business.GamerManager;
import Business.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		//-----------------------------------------GAMER--------------------------------------------------------------

				Gamer gamer1 = new Gamer(1,"Yunus Emre","Çiçek",150,"12425278910",LocalDate.of(2001,5,4));
				Gamer gamer2 = new Gamer(2,"Enes Emir","Çiçek",250,"09876542",LocalDate.of(2003, 9, 30));
				
				Gamer[] gamers = {gamer1,gamer2};
				
				GamerManager gamerManager = new GamerManager(new GamerCheckManager());
				
				for(Gamer gamer:gamers) {
					gamerManager.add(gamer);
					gamerManager.update(gamer);
					gamerManager.delete(gamer);		
				}
				gamerManager.addMoney(gamer2, 25);
				
				System.out.println("--------------------------------");
				
				
				
				
			
				
				
		//-----------------------------------------Campaign--------------------------------------------------------------
				
				Campaign campaign1 = new Campaign(1,"Winter Sale","60%");
				Campaign campaign2 = new Campaign(2,"Summer Sale","75%");
				
				Campaign[] campaigns = {campaign1,campaign2};
				
				CampaignManager campaignManager = new CampaignManager();
				
				for(Campaign campaign:campaigns) {
					
					campaignManager.add(campaign);
					campaignManager.update(campaign);
					campaignManager.delete(campaign);			
				}
				
		//-----------------------------------------------Game------------------------------------------------------		
				
				Game game1 = new Game(1,"Fifa 21", 359);
				Game game2 = new Game(2, "Assassin's Creed Valhalla", 400);
				
				Game[] games = {game1,game2};
				
				GameManager gameManager = new GameManager();
				
				for(Game game:games) {
					gameManager.add(game);
					gameManager.update(game);
					gameManager.delete(game);
				}
				
				
				SalesManager salesManager = new SalesManager();		
				salesManager.buy(gamer1, game2);
				salesManager.sell(gamer2, game1);
				
				

	}

}
