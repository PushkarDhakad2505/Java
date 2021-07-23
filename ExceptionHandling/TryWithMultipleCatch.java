
package ExceptionHandling;
import java.lang.*;
public class TryWithMultipleCatch {
   
        public static void fun(){
        
            try{
                int ar[]={1,2,3,4,5};
                
                //System.out.println(10/0);
                System.out.println(ar[5]);
                
                
            }
            catch(ArithmeticException ae){
                System.out.println(ae);
            }
            catch(ArrayIndexOutOfBoundsException aioob){
                System.out.println(aioob);
            }
            
            System.out.println("normal flow");
            
        }
    public static void main(String []args){
        
        fun();
    }
    
    
    
}
