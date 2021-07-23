
package CollectionPackage.ListPackage;
import java.util.*;
public class VectorClass {

    public static void main(String []args){
        
        Vector <Integer> v1=new Vector<Integer>();
        
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        Iterator i1=v1.iterator();
        while(i1.hasNext()){
            
            System.out.println(i1.next());
            
        }
    }
    


    
}
