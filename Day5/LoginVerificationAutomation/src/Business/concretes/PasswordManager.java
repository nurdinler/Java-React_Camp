
package Business.concretes;

import Business.abstracts.PasswordService;

public class PasswordManager implements PasswordService{

    @Override
    public boolean checkPassword(String password) {
        if(password.length()<6){
            System.out.println("Password can not be less than 6 chars.");
            return false;
        }
        return true;
        
    }
    
}
