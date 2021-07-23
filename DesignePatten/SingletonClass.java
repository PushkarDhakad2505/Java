package DesignePatten;


class SClass {
    private SClass(){
    System.out.println("object Created");
    
    };//private constructor
    public static SClass obj=new SClass();
    public  String s="hi";
    public static SClass getObject(){
        return obj;
    }


}
public class SingletonClass{
    public static void main(String[]args){
       //SClass object=new SClass();//error
       SClass object1=SClass.getObject();
       SClass object2=SClass.getObject();
       SClass object3=SClass.getObject();
       
       
       System.out.println(object1.s);
       System.out.println(object2.s);
       System.out.println(object3.s);
       
       object1.s="hello";
       System.out.println(object1.s);
       System.out.println(object2.s);
       System.out.println(object3.s);
       
//System.out.println(SClass.s);
    }
}
