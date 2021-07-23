package SerializationInJava;
import java.io.*;
class Student implements Serializable{
    
    int age=20;
    int salary=00;
   
}
class Parent implements Serializable{
    
    int age=50;
    int salary=900;
   
}
class Teacher implements Serializable{
    
    int age=30;
    int salary=500;
   
}
public  class orderOfObjectInSerialization {
    
 public static void main(String []args)throws Exception{
    Student s1=new Student();
    Teacher t1=new Teacher();
    Parent p1=new Parent();
    //serialization
    FileOutputStream fos=new FileOutputStream("newfile.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(s1);
    oos.writeObject(t1);
    oos.writeObject(p1);
    //deserialization
    FileInputStream fis=new FileInputStream("newfile.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
//correct order
    Student ss1=(Student)ois.readObject();
    Teacher tt1=(Teacher)ois.readObject();
    Parent pp1=(Parent)ois.readObject();
//incorrect order
//    Student ss1=(Student)ois.readObject();
//    Teacher tt1=(Teacher)ois.readObject();
//    Parent pp1=(Parent)ois.readObject();
    System.out.println(ss1.age+" "+ss1.salary);
    System.out.println(tt1.age+" "+tt1.salary);
    System.out.println(pp1.age+" "+pp1.salary);
      
    }
      
}

