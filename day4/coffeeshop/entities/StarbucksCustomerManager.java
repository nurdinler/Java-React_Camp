
package coffeeshop.entities;

import coffeeshop.abstracts.ICustomerCheckService;
import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager{
    ICustomerCheckService _CustomerCheckService; //it's a service
    
    public StarbucksCustomerManager(ICustomerCheckService _CustomerCheckService){
        this._CustomerCheckService = _CustomerCheckService;
    }
    
    public void welcome(Customer customer){
        System.out.println("WELCOME TO STARBUCKS COFFEE " + customer.firstname);
    }
    @Override
    public void save(Customer customer) throws NumberFormatException,RemoteException{        
        if(_CustomerCheckService.CheckIfRealPerson(customer)){
            System.out.println("Personal informations are not valid");
        }
        else{            
            super.save(customer);
        }
        
        
        
        
    }
    
}
