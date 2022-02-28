
package coffeeshop.abstracts;
import coffeeshop.entities.Customer;
import java.rmi.RemoteException;


public interface ICustomerService {
    public void save(Customer customer)throws NumberFormatException,RemoteException;
}
