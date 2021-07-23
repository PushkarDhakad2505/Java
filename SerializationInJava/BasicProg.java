package SerializationInJava;
import java.io.*;
class Student implements Serializable{
    int age=20;
    int marks=90;
   
}
public class BasicProg {
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
    System.out.println(s1.age+" "+s1.marks);
      
 }
      
}
