
package SerializationInJava;
import java.io.*;

class Account implements Serializable{
    
    String accountName="Pushkar";
    transient String password="1234";
    
//    private void writeObject(ObjectOutputStream oos) throws Exception{
//        oos.defaultWriteObject();//default serialization
//        String ePass="123"+password;
//        oos.writeObject(ePass);
//        
//        
//    }
//    private void readObject(ObjectInputStream ois)throws Exception{
//        ois.defaultReadObject();//default deserialization
//        String ePass=(String)ois.readObject();
//        password=ePass.substring(3);
//    }
    
}

public class CustomisedSerialization {
   
    public static void main(String args[])throws Exception{
        Account a1=new Account();
        System.out.println(a1.accountName+" "+a1.password);
        
        FileOutputStream fos=new FileOutputStream("newfile.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);
        FileInputStream fis=new FileInputStream("newfile.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2=(Account)ois.readObject();
        
        System.out.println(a2.accountName+" "+a2.password);
        
        
        
    }
    
    
    
}
