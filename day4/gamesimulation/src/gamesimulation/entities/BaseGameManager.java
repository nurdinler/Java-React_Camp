
package gamesimulation.entities;

import abstracts.IGameService;
import java.text.DecimalFormat;

public class BaseGameManager implements IGameService{

    @Override
    public void sell(Game game, User user) {
        System.out.println(" "+game.name+" selled to "+user.firstname+ " "+user.lastname);
        /* print two digits after comma
        System.out.println(""+new DecimalFormat(“##.##”).format(number));
        import java.text.DecimalFormat
        */
        System.out.println("Price : "+new DecimalFormat("##.##").format(game.price));
    }
    
}
