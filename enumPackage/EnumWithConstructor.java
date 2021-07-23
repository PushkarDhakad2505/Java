package enumPackage;
enum Color{
    GREEN(0,255,0),RED(255,0,0),BLUE(0,0,255),YELLOW(255,255,0),BLACK(0,0,0);
    int val1,val2,val3;
    Color(int a,int b,int c){
        System.out.println("Constructor with three parameter Called");
        val1=a;
        val2=b;
        val3=c; 
    }    
    public void getValues(){
        System.out.println(val1+" "+val2+" "+val3);
    }           
}
public class EnumWithConstructor {
    public static void main(String [] args){
        Color []c=Color.values();
        for(Color c1:c){
            c1.getValues();
        }
    }
}