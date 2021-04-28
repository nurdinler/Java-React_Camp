
public class Main {
    public static void main(String[] args) {
        
        //Category
        Category category1=new Category(56, "Programlama");
        Category category2 = new Category(78, "Tum");
        Category[] categ_list = {category1,category2};
        System.out.println("-----------------------------");
        System.out.println("Category List");
        for (Category cat : categ_list){
            System.out.println("Category name : "+cat.category_name);
            System.out.println("------------------------------------");
        }
        //Courses
        Courses courses1 = new Courses(567, "Programlama Temel", "Engin Demirog");
        Courses courses2 = new Courses(134, "C# + Angular", "Engin Demirog");
        Courses courses3 = new Courses(145,"Java + React", "Engin Demirog");
        Courses[] course_list = {courses1,courses2,courses3};
        System.out.println("Course List");
        for (Courses course : course_list){
            System.out.println("Course name : " + course.course_name);
            System.out.println("Teacher : "+ course.teacher_name);
            System.out.println("------------------------------------");            
        }      
        // ManegeCourse
        ManageCourse manageCourse = new ManageCourse();
        System.out.print("Enrolling Course1...");
        manageCourse.enrolling(courses1);
        System.out.print("Enrolling Course2... ");
        manageCourse.enrolling(courses2);
        System.out.print("Enrolling Coursee... ");
        manageCourse.enrolling(courses3);
        System.out.print("progress status of course 1 : ");
        manageCourse.processing(courses1);
        System.out.print("progress status of course 2 : ");
        manageCourse.success(courses2);
        System.out.print("progress status of course 3 : ");
        manageCourse.processing(courses3);
        
    
    
    
    }
    
    
    
    
    
            
    
}
