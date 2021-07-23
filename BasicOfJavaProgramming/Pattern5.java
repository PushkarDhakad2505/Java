
package BasicOfJavaProgramming;
import java.util.*;

public class Pattern5 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number ");
        int a=scan.nextInt();
        for(int i=0;i<a;i++){
            for(int k=a;k>i;k--){
                System.out.print("*");
                    
           }

                System.out.println();
        }
        
        
        
    }
    
}
