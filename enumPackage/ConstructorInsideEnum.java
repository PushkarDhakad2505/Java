
package enumPackage;

enum Color{
    GREEN,RED,BLUE,YELLOW(10),RGB(10,20,30);
    int i;
    Color(){
       
        System.out.println("Constructor Called");
    }
    Color(int a){
        i=a;
        System.out.println("Constructor with one parameter Called");
     
    }
    public int getI(){
        return i;
    }
    Color(int a,int b,int c){
        System.out.println("Constructor with three parameter Called");
       
    }    
}
public class ConstructorInsideEnum {
    public static void main(String []args){
        Color []c=Color.values();
        
    }
}
