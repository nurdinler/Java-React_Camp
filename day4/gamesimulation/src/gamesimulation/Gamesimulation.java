/* 
*****KODLAMA.IO DAY4 HW 3*****
This game simulation will
 * Manage new users,sales and new offers.
 * Users will be able to
    * register
    * update their info
    * delete their membership
 * MERNIS verification needed for users
 * simulate an environment where games will be sale.
    * sales should attribution with the user.
* simulate an environment where can be added, delete or update an offer
* sales should be integrated with offers.
*/
package gamesimulation;

import adapters.MernisServiceAdapter;
import gamesimulation.entities.BaseGameManager;
import gamesimulation.entities.BaseOfferManager;
import gamesimulation.entities.BaseUserManager;
import gamesimulation.entities.Game;
import gamesimulation.entities.Offer;
import gamesimulation.entities.User;
import java.rmi.RemoteException;
public class Gamesimulation {
 
    public static void main(String[] args) throws NumberFormatException,RemoteException {
        BaseUserManager usermanager = new BaseUserManager(new MernisServiceAdapter()); 
        BaseGameManager gamemanager = new BaseGameManager();
        BaseOfferManager offermanager = new BaseOfferManager();
        Offer offer1 = new Offer(20.0,"Only 8 days","%20 Discount for every game!");
        Game game1 = new Game("Coffee machine","707",777.7);
        User user1 = new User("Engin","Demirog","1234567890","1999");
        usermanager.save(user1);        
        offermanager.ticket(offer1, game1);
        gamemanager.sell(game1, user1);         
        usermanager.update(user1);
        usermanager.delete(user1);
        
        
        
        
       
        
    }
    
}
