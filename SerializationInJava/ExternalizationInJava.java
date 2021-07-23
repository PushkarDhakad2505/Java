package SerializationInJava;
import java.io.*;

class Student implements Externalizable{
    String name;
    int age;
    int marks;
    public Student(){

        System.out.println("student cons");

    }  
    public Student(String name,int age,int marks){

        this.age=age;
        this.marks=marks;
        this.name=name;
    }  

        public void writeExternal(ObjectOutput out)throws IOException{

        out.writeObject(name);
        out.writeInt(age);
    }

        public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
        name=(String)in.readObject();
            age=in.readInt();
        }

}

public class ExternalizationInJava {
    
    public static void main(String args[]) throws Exception{
        Student s=new Student("Pushkar",20,90);
        
        System.out.println(s.age+" "+s.marks+" "+s.name);
        FileOutputStream fos=new FileOutputStream("newfile.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        FileInputStream fis=new FileInputStream("newfile.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student s1=(Student)ois.readObject();
        System.out.println(s1.age+" "+s1.marks+" "+s1.name);
    }
}
