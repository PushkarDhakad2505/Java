
package CollectionPackage.SetPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
      public static void main(String []args){
    
        TreeSet<String> set=new TreeSet<String>();  
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
