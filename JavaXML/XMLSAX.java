package JavaXML;
import javax.xml.parsers.*;
import org.xml.sax.*;
import java.io.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;
class mysaxHandler extends DefaultHandler{
   
    public void startElement(String uri,String localName,String qName,Attributes attrs){
        System.out.println(" <"+qName+"> ");
    }
    public void characters(char[]ch,int start,int len){
        System.out.println(new String(ch,start,len));
    }
    public void endElement(String uri,String localName,String qName){
        System.out.println("</"+qName+">");
    }
    public void endDocument(){
        System.out.println("Document ends");   
    }
}
public class XMLSAX {
    public static void main(String []args) throws Exception{
        SAXParser p=SAXParserFactory.newInstance().newSAXParser();
        p.parse(new FileInputStream("students.xml"),new mysaxHandler());
    }   
}