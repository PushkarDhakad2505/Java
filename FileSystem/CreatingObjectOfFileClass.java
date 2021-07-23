
package FileSystem;
import java.util.*;
import java.io.*;
public class CreatingObjectOfFileClass {
    public static void main(String []args){
        try{
            File f=new File("abc.txt");
            System.out.println(f.exists());
            f.createNewFile();
            System.out.println(f.exists());
        }    
        catch(Exception e){
            System.out.println(e);
        }
    }
}
