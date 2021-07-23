package FileSystem;
import java.io.File;
public class DirectoryAndFiles {
    public static void main(String []args){
        try{
                //1st Constructor to point a file
                File f=new File("xyz.txt");
                f.createNewFile();
                System.out.println(f.exists());
                //2nd Constructor to point a directory
                File f1=new File("newFolder");
                f1.mkdir();
                System.out.println(f.exists());
                
                //3rd Constructor to point a file inside a directory
                File f2=new File("newFolder","xyz.txt");
                System.out.println(f2.exists());
                f2.createNewFile();
                System.out.println(f2.exists());
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }
}

    
    
    

