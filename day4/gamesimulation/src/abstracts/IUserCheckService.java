
package abstracts;

import gamesimulation.entities.User;
import java.rmi.RemoteException;

public interface IUserCheckService {
    boolean CheckPersonalInfo(User user) throws NumberFormatException, RemoteException;
}
