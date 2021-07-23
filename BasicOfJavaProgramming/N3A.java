package BasicOfJavaProgramming;
import java.util.*;
import static java.lang.Math.abs;
class Other{
    public int[] returnArray(int n){
        Scanner scan =new Scanner (System.in);
        int ar[]=new int[n+1];
        for(int i=0;i<n;i++){
            ar[i]=scan.nextInt();
        }   
        return ar;
    }   
    int findRev(int ar[],int n){
        int neg=n-1;
        for(int i=0;i<n;i++){
            if(ar[i]>=0){
                neg=i;
                break;
            }
        }   
        return neg-1;
    }
    int [] revArray(int []ar,int neg,int n){
        int j=neg;
        for(int i=0;i<neg/2;i++){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            j--;
        }
        return ar;
    }
}
public class N3A {
    public static void main(String [] args){
        Scanner scan =new Scanner (System.in);
        int n=scan.nextInt();
        int ar[]=new int[n+1];
        Other o=new Other();
        ar=o.returnArray(n);
        int neg=o.findRev(ar, n);
        ar=o.revArray(ar, neg, n);
        int j=neg+1;
        int k=0;
        int br[]=new int[n];
        ar[n]=100000;
        for(int i=0;i<n  ;i++){
            if(abs(ar[k])>abs(ar[j]))
            {
                br[i]=ar[j];
                j++;
            }
            else{
                br[i]=ar[k];
                k++;
            }  
        }
        for(int i=0;i<n;i++){System.out.print(br[i]+" ");
        }
    } 
}
