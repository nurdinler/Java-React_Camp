
package gamesimulation.entities;

import abstracts.IUserCheckService;
import abstracts.IUserService;
import java.rmi.RemoteException;

public class BaseUserManager implements IUserService {
    IUserCheckService _UserCheckService;

    public BaseUserManager(IUserCheckService _UserCheckService) {
        this._UserCheckService = _UserCheckService;
    }

    @Override
    public void save(User user) throws NumberFormatException,RemoteException{
        if(_UserCheckService.CheckPersonalInfo(user)){
            System.out.println("User saved : "+user.firstname + " " + user.lastname);}
        else{
            System.out.println("Personal informations are invalid");
        }
    }

    @Override
    public void delete(User user) throws NumberFormatException,RemoteException {
        System.out.println("User deleted : "+user.firstname + " " + user.lastname);
    }

    @Override
    public void update(User user) throws NumberFormatException,RemoteException{
        System.out.println("User updated : "+user.firstname + " " + user.lastname);
    }

    
   
    
    
}
