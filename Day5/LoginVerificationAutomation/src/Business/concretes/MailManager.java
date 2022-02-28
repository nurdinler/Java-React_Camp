
package Business.concretes;

import java.util.ArrayList;
import java.util.regex.Pattern;
import Business.abstracts.MailService;

public class MailManager implements MailService{
    private String regex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
    Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
    @Override
    public boolean isMailValid(String mail,ArrayList<String> maillist) {
        if(mail.isEmpty()){
            System.out.println("E-mail field can not left empty.");
            return false;
        }
        else if(!pattern.matcher(mail).find()){
            System.out.println("E-mail format is not valid.");
            return false;
        }
        if(maillist.contains(mail)){
            System.out.println("This e-mail is already in use.");
            return false;
        }
        maillist.add(mail);
        return true;
        
    }
    
}
