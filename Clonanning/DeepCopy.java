package Clonanning;

import java.lang.*;
class Class1{
    int i;
    Class1(int i){
        this.i=i;
    }
}
class Class2 implements Cloneable{
    public
    int j;
    Class1 c1;
    Class2(Class1 c1,int j){
        this.c1=c1;
        this.j=j;
    }     
   public Object clone() throws CloneNotSupportedException{
       
       Class1 cc1=new Class1(c1.i);
       Class2 cc2=new Class2(cc1,j);
        return cc2;
   }  
}
public class DeepCopy implements Cloneable{
    public static void main(String args[])throws CloneNotSupportedException{
        Class1 c1=new Class1(20);
        Class2 c2=new Class2(c1,30);
        Class2 c3=(Class2)c2.clone();
        System.out.println(c2.j);
        System.out.println(c2.c1.i);
        c3.c1.i=88;
        c3.j=99;
        System.out.println(c2.j);
        System.out.println(c2.c1.i);
    }        
}