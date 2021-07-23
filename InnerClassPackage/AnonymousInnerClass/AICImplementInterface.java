
package InnerClassPackage.AnonymousInnerClass;

interface fruits{
    void eat();
}


public class AICImplementInterface {
    public static void main(String args[]){
        
        fruits f=new fruits(){
            public void eat(){
                System.out.println("Eating");
            }
        };
        f.eat();
    }
    
}
