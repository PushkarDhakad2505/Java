
package ExceptionHandling;

import java.io.*;


public class handlingCheckedException {


//handle using try catch block

    
    public static void main(String args[]){
        try{
            FileReader file=new FileReader("qwerty.txt");
        }
        catch(IOException  fof){
            
            System.out.println(fof);
        }
    }
}

