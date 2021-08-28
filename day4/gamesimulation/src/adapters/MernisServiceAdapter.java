
package adapters;

import abstracts.IUserCheckService;
import gamesimulation.entities.User;
import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IUserCheckService{

    @Override
    public boolean CheckPersonalInfo(User user) throws NumberFormatException, RemoteException {
       /* KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean person = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
                user.getFirstname(), user.getLastname(), Integer.parseInt(user.getYearofbirth()));
        return  person; */
       /* Those lines should've work but I keep getting error with 
          KPSPublicLocator.java
          KPSPublicSoapStub.java files.
       So I'll just simulate it.
       */
       return true;
    }
    
    
}
