
package Business.concretes;

import Business.abstracts.UsernameService;

public class UsernameManager implements UsernameService{

    @Override
    public boolean isUsernameValid(String username) {
        if(username.length()<2){
            System.out.println("Name can not be less than 2 chars.");
            return false;
        }
        return true;
    }
    
}
