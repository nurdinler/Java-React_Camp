
package gamesimulation.entities;

public class User {
    String firstname;
    String lastname;
    String nationalityId;
    String yearofbirth;

    public User(String firstname, String lastname, String nationalityId, String yearofbirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nationalityId = nationalityId;
        this.yearofbirth = yearofbirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(String yearofbirth) {
        this.yearofbirth = yearofbirth;
    }
}
