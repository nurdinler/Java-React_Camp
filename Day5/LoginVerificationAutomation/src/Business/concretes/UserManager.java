
package Business.concretes;

import Business.abstracts.MailService;
import Business.abstracts.PasswordService;
import Business.abstracts.UserService;
import Business.abstracts.UsernameService;
import Business.abstracts.VerificationService;
import Core.abstracts.MenuService;
import Core.concretes.MenuManager;
import Entities.concretes.User;
import java.util.Scanner;

public class UserManager implements UserService {

    @Override
    public boolean signup() {
        User user = new User();        
        Scanner scanner = new Scanner(System.in);
        MailService _MailService= new MailManager();
        PasswordService _PasswordService=new PasswordManager();
        UsernameService _UsernameService=new UsernameManager();
        VerificationService _VerificationService = new VerificationManager();
        System.out.print("Please set your e-mail: ");
        String input=scanner.nextLine();
        if(!_MailService.isMailValid(input,user.getMailList())){
            return false;
        } else {
        }
        user.setE_mail(input);
        System.out.print("Please set your first name: ");        
        input=scanner.nextLine();
        if(!_UsernameService.isUsernameValid(input)){   
            return false;
        }
        user.setName(input);            
        System.out.print("Please set your lastname: ");        
        input=scanner.nextLine();
        if(!_UsernameService.isUsernameValid(input)){
            return false;
        }
        user.setLastname(input);
        System.out.print("Please set a password: ");        
        input=scanner.nextLine();
        if(!_PasswordService.checkPassword(input)){
            return false;
        }
        user.setPassword(input);
        _VerificationService.VerificationLink(user.getE_mail());       
        _VerificationService.AccountVerificated();
        user.getUserList().add(user); 
        return true;
    }

    @Override
    public boolean login() {
        MenuService _MenuService = new MenuManager();
        Scanner scanner = new Scanner(System.in);
        String input;
        User user = new User();
        System.out.print("Please input your e-mail: ");
        input=scanner.nextLine();
        for(int i=0;i<user.getMailList().size();i++){
            if(user.getMailList().get(i).equals(input)){
                System.out.print("Please enter your password: ");
                scanner.next();//dummy
                String password = scanner.nextLine();
                if(user.getUserList().get(i).getPassword().equals(password)){
                    _MenuService.WelcomePage(user.getUserList().get(i));
                    return true;
                }
                System.out.println("Password is not match with your e-mail.");
                return false;
            }            
        }
        System.out.println("This e-mail is not in use.");
        return false;   
        
        
    }
    
}
