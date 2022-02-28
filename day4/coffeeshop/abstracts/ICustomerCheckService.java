
package coffeeshop.abstracts; 
import java.rmi.RemoteException;
import coffeeshop.entities.Customer;


public interface ICustomerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
    
}
