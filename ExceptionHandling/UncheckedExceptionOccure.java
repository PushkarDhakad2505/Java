
package ExceptionHandling;
import java.util.*;

public class UncheckedExceptionOccure {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();//Unchecked exception will occuured when we enter 0
        System.out.println(10/n);
    }
}
