
package coffeeshop.entities;

import coffeeshop.abstracts.ICustomerService;
import java.rmi.RemoteException;


public class NeroCustomerManager extends BaseCustomerManager implements ICustomerService{
    public void welcome(Customer customer){
        System.out.println("WELCOME TO NERO COFFEE " + customer.firstname);
    }

    @Override
    public void save(Customer customer) throws NumberFormatException,RemoteException{
        super.save(customer);
    }
}
