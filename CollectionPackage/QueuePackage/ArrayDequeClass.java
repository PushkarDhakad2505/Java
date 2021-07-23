
package CollectionPackage.QueuePackage;
import java.util.*;

public class ArrayDequeClass {
   
    public static void main(String[] args) {  
        //Creating Deque and adding elements  
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add("Pushkar");  
        deque.add("Dhakad");  
        deque.add("PushkarDhakd"); 
       
        //Traversing elements  
        for (String str : deque) {  
            System.out.println(str);  
        }     
    }  
}  
 