
package coffeeshop.adapters;
import java.rmi.RemoteException;
import coffeeshop.abstracts.ICustomerCheckService;
import coffeeshop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;



public class MernisServiceAdapter implements ICustomerCheckService{

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException{
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean person = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
        		customer.getFirstname(),customer.getLastname(),Integer.parseInt(customer.getDateofbirth()));
        return person;
    }    
}
