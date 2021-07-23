package SerializationInJava.InheritanceInSerializationPac;
import java.io.*;
//parent is serialized
class Person {
     String name="Pushkar";
     Person(){
        System.out.println("person Constructor");
    }    
}
class Student  extends Person implements Serializable{
    
    int age=20;
    Student(){
        System.out.println("Student Constructor");
    }
}

public class ChildIsSerialized {

    public static void main(String args[])throws Exception{
        
        Student s1=new Student();
        s1.age=24;
        s1.name="Dhakad";
        System.out.println(s1.age+" "+s1.name);
        FileOutputStream fos=new FileOutputStream("newFile.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);// default value of name will be saved ie name=null age =24
        FileInputStream fis=new FileInputStream("newFile.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student ss1=(Student)ois.readObject();
        //it will run instance control flow and assigne name="Pushkar"
        //and run no argumnet constructor
        System.out.println(ss1.age+" "+ss1.name);
    }    
}
