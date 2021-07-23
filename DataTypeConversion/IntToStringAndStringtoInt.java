package DataTypeConversion;
class FunctionClass{
    String s="";
    public  String funIntToString1(int a){
        s=Integer.toString(a);
        return s;
    }
    public  String funIntToString2(int a){
        s=String.valueOf(a);
        return s;
    }
    Integer a;
    public  Integer  funStringToInt1(String s){
        a=Integer.parseInt(s);
        return a;
    }
    public  Integer  funStringToInt2(String s){
        a=Integer.valueOf(s);
        return a;
    }

    boolean funFloatToInt(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class IntToStringAndStringtoInt {
    public static void main(String []args){   
        FunctionClass fc=new FunctionClass();
        System.out.println(fc.funIntToString1(100).getClass()+" "+fc.funIntToString1(100));
        System.out.println(fc.funIntToString2(50).getClass()+" "+fc.funIntToString2(50));
        System.out.println((fc.funStringToInt2("433").getClass()+" "+fc.funStringToInt1("433")));
        System.out.println(fc.funStringToInt1("43").getClass()+" "+fc.funStringToInt1("43"));
    }
}
