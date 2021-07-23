
package InnerClassPackage;

public class RegularInnerClass {
    
    public static void main(String [] args)
    {
        UpperClass up=new UpperClass();
        System.out.println(up.upperVar);
        UpperClass.InnerClass in=up.new InnerClass();
        System.out.println(in.innerVar);
        UpperClass.InnerClass.InnerMostClass inMost=in.new InnerMostClass();
        System.out.println(inMost.innerMostVar);
    }   
}
class UpperClass{
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
