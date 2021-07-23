package BasicOfJavaProgramming;
import java.io.*;
import java.util.*;
public class N1A {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int ar[]=new int [100];
        for(int i=0;i<a;i++){
            ar[i]=scan.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    //System.out.println("Inside");
                }System.out.print(ar[j]+" ");
            }
        }
        for(int i=0;i<a;i++){
            System.out.println(ar[i]);
        
        }
    }
     
}
