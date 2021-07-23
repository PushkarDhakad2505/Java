
package CollectionPackage.SetPackage;

import java.util.*;

public class LinkedHashSetClass {

    public static void main(String []args){
        
        
        LinkedHashSet <String>l1= new LinkedHashSet<String>();
        l1.add("Pushkar");
        l1.add("Pushkar");
        l1.add("Push");
        l1.add("kar ");
        l1.add("Dhakad");
        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        
    }





    
}
