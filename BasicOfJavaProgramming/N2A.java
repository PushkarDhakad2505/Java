package BasicOfJavaProgramming;
import java.io.*;
import java.util.*;
public class N2A {
    public static void main(String args[]){
        Scanner scan =new Scanner (System.in);
        int n=scan.nextInt();
        int ar[]=new int[2*n];
        int br[]=new int[2*n];
        int cr[]=new int[2*n];
        for(int i=0;i<n;i++){
            ar[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            br[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            cr[i]=scan.nextInt();
        }
        int result[]=new int[n];
        int a=0,b=0,c=0,k=0;
        while(a<n && b<n && c<n){
            if(ar[a]==br[b] && br[b]==cr[c]){
                System.out.print(ar[a]+" ");
                a++;
                b++;
                c++;
            }
            else if(ar[a]<br[b] && br[b]==cr[c] ){
                a++;
            }
            else if(br[b]<cr[c] && ar[a]==cr[c] ){
                b++;
            }
            else if(cr[c]<br[b] && br[b]==ar[a] ){
                c++;
            }
            else if(ar[a]>br[b] && ar[a]>cr[c] ){
                b++;
                c++;
            }
            else if(br[b]>ar[a] && br[b]>cr[c] ){
                a++;
                c++;
            }
            else if(cr[c]>br[b] && cr[c]>ar[a] ){
                a++;
                b++;
            } 
        }
    }      
}
