
package Core.concretes;

import Core.abstracts.MenuService;
import Entities.concretes.User;
import java.util.Scanner;

public class MenuManager implements MenuService{

    @Override
    public int FirstPage() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an operation.");
        System.out.println("1 - Login");
        System.out.println("2 - Sign in");            
        choice = scanner.nextInt();
        if(choice >2 || choice < 1){
            System.out.println("Invalid choice");
            FirstPage();              
        }
        return choice;
    }

    @Override
    public void WelcomePage(User user) {
        System.out.println("WELCOME "+user.getName().toUpperCase() + " "+user.getLastname().toUpperCase());
    }
    
}
