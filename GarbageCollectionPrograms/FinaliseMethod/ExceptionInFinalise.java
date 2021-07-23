
package GarbageCollectionPrograms.FinaliseMethod;

public class ExceptionInFinalise {
    public static void main(String args[]){
        
        FinaliseMethod s=new FinaliseMethod();
        s=null;
        System.gc();//here gc calls finalize()
        System.out.println("main method end");
        //s.finalize();
   //when we uncomment the upper line it will give error     
    }
    public void finalize(){
        int i=11/0;//JVM will ignore this error if called by GC but give error when called by programmer itself
        System.out.println("Finalize Method Called");
    }
 
    
}

