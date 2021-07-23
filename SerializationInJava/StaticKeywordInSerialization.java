
package SerializationInJava;
import java.io.*;

class Student implements Serializable{
    int age=21;
    transient int marks=90;
    //there will be no effect by making transient variable as static
    //  static int rollNum=160;
    transient static int rollNum=160;
}
public class StaticKeywordInSerialization {

    
 public static void main(String []args)throws Exception{
    Student s=new Student();
    //serialization
    FileOutputStream fos=new FileOutputStream("newfile.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(s);
    
    //deserialization
    FileInputStream fis=new FileInputStream("newfile.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Student s1=(Student)ois.readObject();
    System.out.println(s1.age+" "+s1.marks+" "+s1.rollNum);
      
 }
  

    
}

    

