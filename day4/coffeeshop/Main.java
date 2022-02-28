/* Scenario
 *A customer manager automation for coffee shops.
(in this scenario they are Starbucks and Nero)
 *Customer will be add to database(they will store at same db)
 *Starbucks wants MERNIS verification for customers
 *Starbucks wants to give one star for every coffee
*/

package coffeeshop;

import coffeeshop.adapters.MernisServiceAdapter;
import coffeeshop.entities.BaseCustomerManager;
import coffeeshop.entities.Customer;
import coffeeshop.entities.NeroCustomerManager;
import coffeeshop.entities.StarbucksCustomerManager;
import java.rmi.RemoteException;

public class CoffeeShop {
  
    public static void main(String[] args) throws RemoteException,RemoteException {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        //this is for trial, please enter your personal information to try.
        customerManager.save(new Customer("7","Nur","Dinler","7777","7777777777"));
       
    }
    
}
