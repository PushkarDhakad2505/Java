package FileSystem;
import java.io.*;
public class FileInputStreamExample {
    public static void main(String []args) throws IOException{
        
        File f=new File("File.txt");
        f.createNewFile();
        int i;
        FileInputStream fout=new FileInputStream(f);        
        FileInputStream fout1=new FileInputStream(f);
        do{
            i=fout.read();
            if(i!=-1)
                System.out.println(i);
        }
        while(i!=-1);//reading till end of file
        do{
            i=fout1.read();
            if(i!=-1)
                System.out.print((char)i);
        }
        while(i!=-1);System.out.println();
    }
}
