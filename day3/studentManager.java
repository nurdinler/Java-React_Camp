
public class studentManager extends userManager{
    @Override
    public void add(){
       System.out.println("Student "+getName()+" added");
       System.out.println("User Id : "+getUserid());
    }
    public void remove(){
        System.out.println(""+getName()+" "+getLastname()+" removed" );
    }
    
}
