
package JavaXML.JAXB;
import java.io.File;
import javax.xml.*;
import javax.xml.bind.*;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBContext;
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
public class XMLToObject {  
    public  Mobile convertXMLToObject(){
        Mobile obj=null;
        try{
               JAXBContext context=JAXBContext.newInstance(Mobile.class);
               Unmarshaller unmarshaller =context.createUnmarshaller();
               obj=(Mobile) unmarshaller.unmarshal( new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaTask\\mobile.xml"));
        }
        catch(Exception e){
            System.out.println(e);
        }
        return obj;
    }
    public static void main(String []args){
        Mobile mobile=new Mobile("SAMSUNG","WHITE",30000);
        XMLToObject ox=new XMLToObject();
        Mobile mob=ox.convertXMLToObject();
        if(mob!=null){
            System.out.println("Name"+mob.name);
            System.out.println("Color"+mob.color);
            System.out.println("Price"+mob.price);
        }
    }
}
