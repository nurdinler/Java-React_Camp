
public class userManager {    
    private String _id;
    private String _name;
    private String _lastname;
    private String _userid;
    
    public void add(){
        System.out.println("User added!");
    }

    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(String id) {
        _id=id;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _lastname
     */
    public String getLastname() {
        return _lastname;
    }

    /**
     * @param _lastname the _lastname to set
     */
    public void setLastname(String _lastname) {
        this._lastname = _lastname;
    }

    /**
     * @return the _userid
     */
    public String getUserid() {
        return _userid;
    }

    /**
     * @param _userid the _userid to set
     */
    public void setUserid() {
        _userid = _name.substring(0, 1) + _id;
    }
    
}
