
package Entities.concretes;

import Entities.abstracts.EntitiyService;
import java.util.ArrayList;


public class User implements EntitiyService{
    private String name;
    private String lastname;
    private String e_mail;
    private String password;
    private ArrayList<String> mailList = new ArrayList<>();
    private ArrayList<User> userList = new ArrayList<>();
    
    public User(){        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getMailList() {
        return mailList;
    }

    public void setMailList(ArrayList<String> mailList) {
        this.mailList = mailList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    
}
