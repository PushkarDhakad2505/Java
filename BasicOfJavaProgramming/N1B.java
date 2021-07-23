
package BasicOfJavaProgramming;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class N1B {

    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int ar[]=new int [100];
        for(int i=0;i<a;i++){
            ar[i]=scan.nextInt();
        }
        int j=a-1;
        for(int i=0;i<j;i++){
            if(ar[i]==1 && ar[j]==0){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                j--;
            }
            else if(ar[i]==1 && ar[j]==1){
                i--;
                j--;
            }

        }
        for(int i=0;i<a;i++){
            System.out.println(ar[i]);
        }
    }
}