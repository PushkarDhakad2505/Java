
package InnerClassPackage;


class Outer{
    static class Inner{
        public   static void m1(){
            System.out.println("Hi");
        }
    }
}



public class StaticNestedClass {

public static void main(String args []){
    
    Outer.Inner.m1();
}


    
}
