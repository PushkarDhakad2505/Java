
package ExceptionHandling;
import java.io .*;


//handled by  java default mechanism

public class UseOfThrows {
    static void m1()throws IOException{  
  throw new IOException("device error");  
 }  
    public static void main(String []args)throws IOException{
        
        m1();
        System.out.println("Normal Flow");
    }
      
}


//handled by us

//
//public class UseOfThrows {
//    static void m1()throws IOException{  
//  throw new IOException("device error");  
// }  
//    public static void main(String []args){
//        try{
//        m1();
//        }
//        catch(IOException ioe){
//            System.out.println(ioe);  
//        }
//        System.out.println("Normal Flow");
//    }
//}
