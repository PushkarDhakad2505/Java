package FileSystem;

import java.io.File;

public class MethodsOfFile {
    public static void main(String []args){
        try{
                //files
                File f=new File("abc.txt");
                f.createNewFile();
                System.out.println(f.exists());
                System.out.println(f.isFile());
                System.out.println(f.isDirectory());
                String []s=f.list();
                System.out.println(s);
                System.out.println(f.length());
                //directory
                File f1=new File("newfolder");
                f1.mkdir();
                System.out.println(f1.exists());
                System.out.println(f1.isFile());
                System.out.println(f1.isDirectory());
                String []s1=f1.list();
                System.out.println(s1[0]);
                System.out.println(f1.length());
                
        }
        catch(Exception e){
                System.out.println(e);
        }
        
    }
    
    
    
}
