
package CollectionPackage.SetPackage;

import java.util.*;
public class HashSetClass {
    
    public static void main(String []args){
    
        HashSet<String> set=new HashSet<String>(); 
        set.add("Pushkar");
        set.add("Pushkar");
        set.add("Dhakad");
        set.add("PD");
        set.add("Pskr");
        
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
    
}
