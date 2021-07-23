
package InnerClassPackage.AnonymousInnerClass;


public class AICExtendClass{
    
    public static void main(String []args){
        
        Popcorn p=new Popcorn(){  
            public void taste(){
                System.out.println("Sweet");
            }
        };
        p.taste();//sweet
        Popcorn p1=new Popcorn();
        p1.taste();//salty
        Popcorn p2=new Popcorn(){
          public void taste (){
              System.out.println("Spicy");
          }

        };
        p2.taste();//spicy
    
    }
}
class Popcorn{
    public void taste(){
        System.out.println("Salty");
    }
}