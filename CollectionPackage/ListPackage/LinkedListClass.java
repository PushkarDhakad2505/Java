package CollectionPackage.ListPackage;

import java.util.*;

public class LinkedListClass {

    public static void main(String []args){
        LinkedList<Integer> ll1=new LinkedList<Integer>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        Iterator i=ll1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

