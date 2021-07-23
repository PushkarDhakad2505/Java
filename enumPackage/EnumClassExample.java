package enumPackage;
enum Color{
    GREEN,BLUE,RED;
}
public class EnumClassExample {
    public static void main(String []args){
        Color []cArray=Color.values();
        for(Color c1:cArray){
            System.out.println(c1);
        }
    }
}
