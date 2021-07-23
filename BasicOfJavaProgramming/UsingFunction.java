
package BasicOfJavaProgramming;
import java.util.*;
import java.io.*;
public class UsingFunction {
    public static int getChoice(){
        System.out.println("1.factorial ");
        System.out.println("2.palindrom ");
        System.out.println("3.Print Name ");
        System.out.println("4.exit ");
        System.out.print("Enter choice ");
        Scanner scan=new Scanner (System.in);
        int choice=scan.nextInt();
            return choice;
    }
    public static int factorial(int num){
        if(num<2)
            return num;
        else
            return num*factorial(num-1);
    }
    public static boolean palindrom(int num){
        int sum=0;
        int n=num;
        int digit;
        while(n>0){
            digit=n%10;
            n=n/10;
            sum=sum*10+digit;
        }
        if(num==sum)
            return true;
        else
            return false;
    }
    public static String PrintName(){
        System.out.println("Enter String to print ");
        Scanner scann=new Scanner(System.in);
        String name=scann.next();
        return name;
    }
    
    public static void main(String[] args){
        while(true){
        int choice=getChoice();
        Scanner sc=new Scanner (System.in);
        switch(choice){
            case 1:
                System.out.println("Enter number to calculate factorial ");
                int num=sc.nextInt();
                System.out.println("factorial is "+factorial(num));
                break;
            case 2:
                System.out.println("Enter number to find number is palindrom or not ");
                num=sc.nextInt();
                System.out.println(palindrom(num));
                break;

            case 3:
                System.out.println(PrintName());
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.print("Enter valid string ");
            }
        }
    }
}