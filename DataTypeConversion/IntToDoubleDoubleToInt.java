package DataTypeConversion;
class FunctionClass{
    Integer a;
    public Integer funFloatToInt(Double d){
        a=d.intValue();
        return a;
    }
    Double d;
    public Double funIntToFloat(Integer i){
        d=i.doubleValue();
        return d;
    }
}
public class IntToDoubleDoubleToInt {
    public static void main(String []args){
        FunctionClass fc=new FunctionClass();
        System.out.println(fc.funFloatToInt(11.64).getClass()+" "+fc.funFloatToInt(11.64));
        System.out.println(fc.funIntToFloat(11).getClass()+" "+fc.funIntToFloat(11));
    }
}