
package GarbageCollectionPrograms;

public class NullifyTheObject {
     static NullifyTheObject n1;
     NullifyTheObject n2;   
    public static void main(String[]args){
        NullifyTheObject n1=new NullifyTheObject();
        NullifyTheObject n2=new NullifyTheObject();
      //  n1=null;
      //  n2=null;
    }   //n1 and n2 are eligible for garbage collection
    
    
    public static int sum ()
    {
      n1=new NullifyTheObject();
      n2=new NullifyTheObject();
    
    return 0;
    }
    
}