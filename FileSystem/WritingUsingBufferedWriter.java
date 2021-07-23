
package FileSystem;
import java.io.*;
public class WritingUsingBufferedWriter {
    public static void main(String []args) throws IOException{
        
        FileWriter fileW=new FileWriter("file.txt",true);
        BufferedWriter bw=new BufferedWriter(fileW);
        bw.write("Pushkar Dhakad");
        bw.close();
    }


    
}
