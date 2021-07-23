package FileSystem;
import java.io.*;
public class FileOutputStreamExample {
    
    public static void main(String []args) throws IOException{
        
        File f=new File("File.txt");
        f.createNewFile();
        
        FileOutputStream fout=new FileOutputStream(f);
        String s="Pushkar";
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            fout.write(ch[i]);
        }
        
        
        
        
    }
    
    
}
