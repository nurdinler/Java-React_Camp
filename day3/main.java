
public class main {
    public static void main(String[] args) {
        //defining student
        studentManager student1 = new studentManager();
        student1.setId("14680987");
        student1.setLastname("Güngör");
        student1.setName("Burcu");
        student1.setUserid();
        student1.add();
        //defining instructor
        instructorManager instructor = new instructorManager();
        instructor.setId("465865");
        instructor.setLastname("Demirog");
        instructor.setName("Engin");
        instructor.setUserid();
        instructor.add();
        
        student1.remove();
        instructor.remove();
        
        
        
    }
    
    
    
    
}
