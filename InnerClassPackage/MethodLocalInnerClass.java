
package InnerClassPackage;
public class MethodLocalInnerClass {
   public  void m1(){     
       class InnerClass{
           
           public void m2(){
               System.out.println("Inside m2")
           }   
       }
       InnerClass ic=new InnerClass();
       ic.m2();
       System.out.println("Inside m1");
   }
   public static void main(String []args){
       MethodLocalInnerClass mi1=new MethodLocalInnerClass();
       mi1.m1();
       System.out.println("Inside main");
   }

    
}
