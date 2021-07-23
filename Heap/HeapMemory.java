package Heap;


public class HeapMemory {
    public static void main(String args[]){
        Runtime r=Runtime.getRuntime();
        //status in byte
        System.out.println(r.freeMemory());
        System.out.println(r.totalMemory());
        System.out.println(r.maxMemory());
        int mb=1024*1024;
        //status in mb
        System.out.println((r.freeMemory()/mb));
        System.out.println(r.totalMemory()/mb);
        System.out.println(r.maxMemory()/mb);
   
    }
}
