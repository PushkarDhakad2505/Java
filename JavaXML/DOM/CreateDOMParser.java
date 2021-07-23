package JavaXML.DOM;
import java.io.*;
import java.util.*;

import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

import org.xml.sax.SAXException;


public class CreateDOMParser {
    
    public static void main(String []args) throws Exception{
        
        File xmlFile= new File("users.xml");
        System.out.println(xmlFile.exists());
        
        DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder db=dbFactory.newDocumentBuilder();
        Document doc =db.newDocument();

        Element rootele=doc.createElement("Students");
        Element studentele=doc.createElement("Student");
        Element nameele=doc.createElement("name");
        Element emailele=doc.createElement("email");
        Element mobileele=doc.createElement("mob");
        Element addressele=doc.createElement("address");
        
        
        
        Text t1=doc.createTextNode("Pushkar");
        Text t2=doc.createTextNode("Pushkar123@gmail.com");
        Text t3=doc.createTextNode("9549189066");
        Text t4=doc.createTextNode("Indore");
        
        nameele.appendChild(t1);
        emailele.appendChild(t2);
        mobileele.appendChild(t3);
        addressele.appendChild(t4);
        
        
        
        
        studentele.appendChild(nameele);
        studentele.appendChild(emailele);
        studentele.appendChild(mobileele);
        studentele.appendChild(addressele);
        rootele.appendChild(studentele);
        doc.appendChild(rootele);
        Transformer t=TransformerFactory.newInstance().newTransformer();
        t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("students.xml")));
        System.out.println("Xml File Generator");
        
    }

    
}
