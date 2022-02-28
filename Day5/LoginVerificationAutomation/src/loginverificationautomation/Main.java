
package loginverificationautomation;

import Business.concretes.UserManager;
import Core.abstracts.MenuService;
import Core.concretes.MenuManager;

public class Main {

    public static void main(String[] args) {
        UserManager usermanager = new UserManager();
        MenuService _MenuService = new MenuManager();
        int choice = _MenuService.FirstPage();
        if(choice == 1){
            if(!usermanager.login()){
                System.out.println("Login failed."); 
            }
        }
        else if(choice==2){
            if(usermanager.signup()){
                System.out.println("Signing up is successful!");
            }
            else{
                System.out.println("Signing up failed.");                
            }
        }
    }
    
}
