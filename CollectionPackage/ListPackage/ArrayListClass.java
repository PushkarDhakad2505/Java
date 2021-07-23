
package CollectionPackage.ListPackage;

import java.util.*;

public class ArrayListClass {

    public static void main(String []args){
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        ar1.add(4);
        Iterator i=ar1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
