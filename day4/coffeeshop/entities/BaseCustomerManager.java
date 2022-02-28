
package coffeeshop.entities;

import coffeeshop.abstracts.ICustomerService;
import java.rmi.RemoteException;

public class BaseCustomerManager implements ICustomerService{

    @Override
    public void save(Customer customer) throws NumberFormatException,RemoteException{
        System.out.println("Customer added to database : "+customer.firstname+customer.lastname);
    }
    
}
