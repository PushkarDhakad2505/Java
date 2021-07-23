
package SerializationInJava.InheritanceInSerializationPac;
import java.util.*;
import java.io.*;

//parent is serialized
class Person implements Serializable{
     String name="Pushkar";
    
}
class Student extends Person{
    
    int age=20;
    
}

public class ParentIsSerialized {

    public static void main(String args[])throws Exception{
        
        Student s1=new Student();
        
        System.out.println(s1.age+" "+s1.name);
        FileOutputStream fos=new FileOutputStream("newFile.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        FileInputStream fis=new FileInputStream("newFile.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student ss1=(Student)ois.readObject();
        
        System.out.println(ss1.age+" "+ss1.name);
        
    }

    
}
