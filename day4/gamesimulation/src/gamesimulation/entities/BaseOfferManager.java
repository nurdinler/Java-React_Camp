
package gamesimulation.entities;

import abstracts.IOfferService;

public class BaseOfferManager implements IOfferService{

    @Override
    public void ticket(Offer offer, Game game) {
        game.price = game.price - ((game.price * offer.offerprice)/100);
        System.out.println("***************"+offer.offername+"***************");
    }
    
}
