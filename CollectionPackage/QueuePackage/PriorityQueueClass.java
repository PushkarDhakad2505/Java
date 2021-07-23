
package CollectionPackage.QueuePackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueClass {
 
    public static void main(String[] args) {  
        //Creating Deque and adding elements  
        PriorityQueue<String> deque = new PriorityQueue<String>();
        deque.add("Pushkar");  
        deque.add("Dhakad");  
        deque.add("PushkarDhakd"); 
       
        //Traversing elements  
        for (String str : deque) {  
            System.out.println(str);  
        }     
    }  
    
    
    
}
