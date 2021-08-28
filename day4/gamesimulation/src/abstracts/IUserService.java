
package abstracts;

import gamesimulation.entities.User;
import java.rmi.RemoteException;

public interface IUserService {
    public void save(User user) throws NumberFormatException,RemoteException;
    public void delete(User user) throws NumberFormatException,RemoteException;
    public void update(User user) throws NumberFormatException,RemoteException;
}
