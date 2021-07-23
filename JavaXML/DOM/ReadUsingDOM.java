
package JavaXML.DOM;

import java.io.*;
import java.util.*;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
import javax.xml.parsers.*;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;


public class ReadUsingDOM {
    public static void main(String []args) throws Exception{
        
        File xmlFile= new File("users.xml");
        System.out.println(xmlFile.exists());
        
        DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder db=dbFactory.newDocumentBuilder();
        Document doc =db.parse(xmlFile);

        System.out.println(doc.getDocumentElement().getNodeName()+" ");
        
        NodeList nodeList = doc.getElementsByTagName("User");
        ArrayList  Userlist=new ArrayList();
        //store in array
        for(int i=0;i<nodeList.getLength();i++){
            Userlist.add(getUser(nodeList.item(i)));
        }
        //print all elements
        for(Object user1:Userlist){
             System.out.println(user1.toString());
        }
}
    private static JavaXML.DOM.User  getUser(Node node){
            JavaXML.DOM.User user=new JavaXML.DOM.User();
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("hi"+element.getElementsByTagName("id").item(0).getTextContent());
              
                System.out.println("hi"+element.getElementsByTagName("firstName").item(0).getTextContent());
                System.out.println("hi"+element.getElementsByTagName("lastName").item(0).getTextContent());
                System.out.println("hi"+element.getElementsByTagName("gender").item(0).getTextContent());
                System.out.println("hi"+element.getElementsByTagName("age").item(0).getTextContent());
//                user.setId(Integer.parseInt(getTagValue("id", element)));
//                user.setFirstName(getTagValue("firstName", element));
//                user.setLastName(getTagValue("lastName", element));
//                user.setGender(getTagValue("gender", element));
//                user.setAge(Integer.parseInt(getTagValue("age", element)));
            }

        return user;
    }
           private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();  
    }
}
class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" +
            gender + "]";
    }
}