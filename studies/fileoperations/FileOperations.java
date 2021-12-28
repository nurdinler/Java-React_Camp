
package fileoperations;
import java.io.File; // File class from java.io package allows us to work wih files
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; // to handle errors
import java.util.Scanner;
/*
    This is study notes for file operations in java
    Do not run it
    src:w3schools.com

*/
public class FileOperations {

    public static void main(String[] args) throws IOException {
        //To use the File class, create an object of the class, 
        //and specify the filename or directory name: 
        File myFile = new File("filename.txt");
        myFile.canRead(); //returns boolean,Tests whether the file is readable or not
        myFile.canWrite(); //returns boolean,Tests whether the file is writable or not
        myFile.createNewFile(); //returns boolean,creates an empty file
        myFile.delete(); //returns boolean,deletes a 'file'
        myFile.exists();//returns boolean,tests whether the file exists
        myFile.getName();//returns string,returns the name of file
        myFile.getAbsolutePath();//returns string,returns the absolute pathname of the file
        myFile.length();//returns long,Returns the size of the file in bytes
        myFile.list();//returns String[],Returns an array of the files in the directory
        myFile.mkdir();//return boolean,creates a directory
        /*
            To create a file in Java, you can use the createNewFile() method. 
            This method returns a boolean value: true if the file was successfully created, 
            and false if the file already exists. 
            Note that the method is enclosed in a try...catch block. 
            This is necessary because it throws an IOException if an error occurs
            (if the file cannot be created for some reason):
        */
        try{
            File myFile1 = new File("filename.txt");
            /*
                To create a file in a specific directory (requires permission), 
                specify the path of the file and use double backslashes 
                to escape the "\" character (for Windows). 
                On Mac and Linux you can just write the path, 
                like: /Users/name/filename.txt            
            */
            File myObj = new File("C:\\Users\\MyName\\filename.txt");
            if(myFile1.createNewFile()){
                System.out.println("File Created: "+myFile1.getName());                
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException error){
            System.out.println("An error occurred");
            error.printStackTrace();
        }
        /*      WRITE TO A FILE
            we use the FileWriter class together with its write() method to 
            write some text to the file we created in the example above. 
            Note that when you are done writing to the file, 
            you should close it with the close() method:
        */
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in java might be tricky, but it is fun enough! ");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        /*  READ A FILE          
        
        */        
        try {
            File newOne = new File("filename.txt");
            Scanner scanner = new Scanner(newOne); 
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException error) {
            System.out.println("An error occurred");
            error.printStackTrace();
        }
        /*
            GET FILE INFORMATIONS
            To get more information about a file, use any of the File methods:
            Note: There are many available classes in the Java API that 
            can be used to read and write files in Java: 
            FileReader, BufferedReader, Files, Scanner, FileInputStream, 
            FileWriter, BufferedWriter, FileOutputStream, etc. 
            Which one to use depends on the Java version you're working with
            and whether you need to read bytes or characters, 
            and the size of the file/lines etc.
        */
        if(myFile.exists()){
            System.out.println("filename: "+myFile.getName());
            System.out.println("absolute path: "+myFile.getAbsolutePath());
            System.out.println("wrieable: "+myFile.canWrite());
            System.out.println("readable: "+myFile.canRead());
            System.out.println("file size in bytes: "+myFile.length());
            
        }
        else{
            System.out.println("File does not exist");
        }
        /* DELETE A FILE
            to delete a file in Java, use the delete() method:
        */
        if(myFile.delete()){
            System.out.println("Deleted the file: "+myFile.getName());
        }
        else{
            System.out.println("Failed to deleted the file");
        }
        /*  DELETE A FOLDER
            You can also delete a folder. However, it must be empty:
        */
        File myFolder = new File("C:\\somefolder\\somefolderagain\\test");
        if(myFolder.delete()){
            System.out.println("Folder deleted");
        }
        else{
            System.out.println("file cannot deleted");
        }
    }
    
}
