
package coffeeshop.entities;

import coffeeshop.abstracts.ICustomerCheckService;


public class CustomerCheckManager implements ICustomerCheckService{

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
    
    
    
}
