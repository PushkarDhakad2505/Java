
package ExceptionHandling;
import java.util.*;
import java.io.*;

public class CheckedExceptionOccure {

    public static void main(String args[]){
    
        try{
            FileReader file=new FileReader("qwerty.txt");//Error fileNotFound
            //FileReader file=new FileReader("abc.txt");//shows no error
            Scanner scan=new Scanner(file);
            String s=scan.nextLine();
            System.out.println(s);
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("Normal Flow");
        
    }
    
}
