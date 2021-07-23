package GarbageCollectionPrograms.ReqJVMForGC;

import java.util.*;

public class UsingRuntimeClass {
    public static void main(String [] args) {
        
    
        Runtime r=Runtime.getRuntime();
        r.gc();
        System.out.println("total"+r.totalMemory());
        System.out.println("free"+r.freeMemory());
        Date d=new Date();
        d=null;
        r.gc();    
        System.out.println("free"+r.freeMemory());

    }
}