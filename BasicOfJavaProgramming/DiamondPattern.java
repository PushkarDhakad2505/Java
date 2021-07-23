/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicOfJavaProgramming;
import java.util.*;
/**
 *
 * @author HP
 */
public class DiamondPattern {
    public static void main(String []args){
        
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
        
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }  
            for(int k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }for(int i=0;i<n;i++){
            for(int l=-1;l<=i;l++){
                System.out.print(" ");
            }  
            for(int m=n-1;m>i;m--){
                System.out.print(" *");
            }
            System.out.println();
  
        }
        
        
    }
}
