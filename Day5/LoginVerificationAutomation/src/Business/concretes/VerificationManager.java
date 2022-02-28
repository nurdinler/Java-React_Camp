
package Business.concretes;

import Business.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

    @Override
    public void VerificationLink(String mail) {
        System.out.println("Verification link sended to "+mail);
        AccountVerificated();
    }
    @Override
    public void AccountVerificated() {
        System.out.println("Account verificated.");
    }
    
}
