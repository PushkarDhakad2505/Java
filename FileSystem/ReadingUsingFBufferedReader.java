/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileSystem;

import java.io.*;
public class ReadingUsingFBufferedReader {
    
        public static void main(String []args) throws IOException{
        
        FileReader fileR=new FileReader("file.txt");
        BufferedReader bw=new BufferedReader(fileR);
       //read line by line
       String s;
       do{
       s=bw.readLine();
        System.out.println(s);
       }while(s!=null);
//        
//        int i;
//        do{
//            i=bw.read();
//            System.out.print((char)i); 
//           
//       }while(i!=-1);
//        System.out.println();
//        
        
        
        
        bw.close();
    } 
}
