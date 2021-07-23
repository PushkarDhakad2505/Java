
package enumPackage;
enum Color{
    GREEN,BLUE,RED;
    static int  variable1;
    public static void setVar(){
        variable1=20;   
    }
    public static int getVar(){
        return variable1;
    }
}
public class FunAndVariableInsideEnum {
    public static void main(String []args){
        Color.setVar();
        System.out.println(Color.getVar());
    
    
    }
}
