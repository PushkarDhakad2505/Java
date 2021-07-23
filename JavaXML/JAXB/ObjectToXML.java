package JavaXML.JAXB;
import java.io.File;
import javax.xml.*;
import javax.xml.bind.*;

class Mobile{
    String name,color;
    int price;
    Mobile(){}
    Mobile(String name,String color,int  price){
        this.name=name;
        this.color=color;
        this.price=price;
    }
}
public class ObjectToXML {
    
    public  void convertObjectToXML(Mobile obj){
        try{
            JAXBContext context=JAXBContext.newInstance(Mobile.class);
            Marshaller marshaller =context.createMarshaller();
            marshaller.marshal(obj, new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaTask\\mobile.xml"));
            marshaller.marshal(obj, System.out);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String []args){
        Mobile mobile=new Mobile("SAMSUNG","WHITE",30000);
        ObjectToXML ox=new ObjectToXML();
        ox.convertObjectToXML(mobile);
    }
}
