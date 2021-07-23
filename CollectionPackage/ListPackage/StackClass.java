package CollectionPackage.ListPackage;

import java.util.*;

public class StackClass {
    
    public static void main(String args[]){
        
        Stack <Integer> stk = new Stack <Integer>();
        stk.add(1);
        stk.add(2);
        stk.add(3);
        stk.add(4);
        Iterator it=stk.iterator();;  
        while(stk.size()>0){
            System.out.println(stk.peek());
            stk.pop();
        }
    }   
}
