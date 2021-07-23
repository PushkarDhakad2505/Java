
package ExceptionHandling;
import java.util.*;
import java.lang.*;
public class UseOfThrow {

    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int balance=scan.nextInt();
        int withdraw=scan.nextInt();
        try{
            if(balance<withdraw){
                throw new ArithmeticException("low account balance");
            }
            else{
                balance=balance-withdraw;
                System.out.println("Remaining balance "+balance);
            }
        }catch(ArithmeticException ae){
            System.out.println(ae);
            
        }
    } 
}
