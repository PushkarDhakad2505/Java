
package GarbageCollectionPrograms.FinaliseMethod;

public class FinaliseMethod {
    static int count;
    int a;
    FinaliseMethod(){
        count++;       
} 
    public static void main(String args[]) throws InterruptedException{
        
        FinaliseMethod s=new FinaliseMethod();
        {
            FinaliseMethod s1=new FinaliseMethod();
            FinaliseMethod s2=new FinaliseMethod();
            FinaliseMethod s3=new FinaliseMethod();
            s1=null;
            s2=null;
            s3=null;
        }
    
        System.out.println(count);
        System.gc();
        System.out.println("main method end");
        Thread.sleep(1000);
        System.out.println(count);
    }
    
    public void finalize(){
        count--;
        System.out.println("Finalize Method Called");
    }
 
    
}
