
package GarbageCollectionPrograms;


public class ObjectCreatedInsideMethod {
    
    public static void main(String []args){
        m1();
    }
    static public void m1(){
        ObjectCreatedInsideMethod o1=new ObjectCreatedInsideMethod();
        ObjectCreatedInsideMethod o2=new ObjectCreatedInsideMethod();
    }//once this method complete both are eligible for garbage collection
    
    
    
}
