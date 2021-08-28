
package gamesimulation.entities;

public class Offer {
    Double offerprice;
    String expirationtime;
    String offername;

    public Offer(Double offerprice, String expirationtime,String offername) {
        this.offerprice = offerprice;
        this.expirationtime = expirationtime;
        this.offername = offername;
    }

    public String getOffername() {
        return offername;
    }

    public void setOffername(String offername) {
        this.offername = offername;
    }

    public Double getOfferprice() {
        return offerprice;
    }

    public void setOfferprice(Double offerprice) {
        this.offerprice = offerprice;
    }

    public String getExpirationtime() {
        return expirationtime;
    }

    public void setExpirationtime(String expirationtime) {
        this.expirationtime = expirationtime;
    }
    
   
}
