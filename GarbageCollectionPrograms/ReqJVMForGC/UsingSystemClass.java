
package GarbageCollectionPrograms.ReqJVMForGC;

import java.util.*;
public class UsingSystemClass {
    public static void main(String []args){
        
        UsingSystemClass u1=new UsingSystemClass();
        UsingSystemClass u2=new UsingSystemClass();
        u1=null;
        u2=null;
        //it runs garbage collector
    System.gc();
   
    }
    
    
}
