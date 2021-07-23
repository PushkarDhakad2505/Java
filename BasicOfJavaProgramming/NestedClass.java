
package BasicOfJavaProgramming;
class UpperClaass{
    int upperVar=10;
    public void getupperVar(){
        System.out.println("upperclass"+upperVar);
    }
    class InnerClass{
        int innerVar=20;   
    public void getInnerClassVar(){
        System.out.println("InnerClassVar"+innerVar);

    }
        class InnerMostClass{
            int innerMostVar=30;

            public void getupperVar(){

                System.out.println("innerMostclassVar"+innerMostVar);

            }
        }
    }
}

public class NestedClass {
    public static void main(String [] args)
    {
        UpperClaass up=new UpperClaass();
        System.out.println(up.upperVar);
        UpperClaass.InnerClass in=up.new InnerClass();
        System.out.println(in.innerVar);
        UpperClaass.InnerClass.InnerMostClass inMost=in.new InnerMostClass();
        System.out.println(inMost.innerMostVar);
        
        
    }
    
    
    
    
    
}
