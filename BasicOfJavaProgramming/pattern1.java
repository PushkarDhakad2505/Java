/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicOfJavaProgramming;
import java.util.*;
import java.io.*;
/**
 *
 * @author HP
 */
public class pattern1 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number ");
        int a=scan.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
                    
            }
                System.out.println();
        }
        
        
        
    }
    
}
