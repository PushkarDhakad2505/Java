
package BasicOfJavaProgramming;
import java.io.*;
import java.util.*;
public class calculator {
    public static void main(String []args){
        int c=0;
        while(true){
            
            Scanner choice=new Scanner(System.in);
            System.out.println("1.addition ");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication ");
            System.out.println("4.Division ");
            System.out.println("5.modulo ");
            System.out.println("6.Exit");
            System.out.print("Select option ");
            int select=choice.nextInt();
            if(select==6)
                break;
            else{
                System.out.println("enter 1st number ");
                int a=choice.nextInt();
                System.out.println("enter 2nd number ");
                int b=choice.nextInt();
                
                switch(select){
                    case 1:
                        c=a+b;
                        break;
                    case 2:
                        c=a-b;
                        break;
                    case 3:
                        c=a*b;
                        break;
                    case 4:
                        c=a/b;
                        break;
                    case 5:
                        c=a%b;
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Please enter valid choice ");
                }
                System.out.println("Result is "+c);
            }
        }   
    }
}
