
package BasicOfJavaProgramming;
import java.util.*;

public class Pattern2 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number ");
        int a=scan.nextInt();
        for(int i=0;i<a;i++){
            for(int j=a;j>i;j--){
                System.out.print(" ");
                    
            }
             for(int k=0;k<i+1;k++){
                System.out.print("*");
                    
            }
            
//            
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//                    
//            }
                System.out.println();
        }
        
        
        
    }
    
}
