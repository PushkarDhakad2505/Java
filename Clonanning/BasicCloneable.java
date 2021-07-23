package Clonanning;
import java.lang.*;
public class BasicCloneable implements Cloneable {
    int i;
    BasicCloneable(int i){
        this.i=i;
    }
    public static void main(String []args)throws CloneNotSupportedException{
        BasicCloneable b1=new BasicCloneable(10);
        BasicCloneable b2=(BasicCloneable)b1.clone();
        System.out.println(b1.i);
        System.out.println(b2.i);
        b2.i=20;
        System.out.println(b1.i);
        System.out.println(b2.i);
 
    }
 
}
