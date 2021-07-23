
package DataTypeConversion;
class FunctionClass{
    Integer a;
    public Integer funFloatToInt1(Float f){
        a=f.intValue();
        return a;
    }
    public int funFloatToInt2(float f){
        int a1;
        a1=(int)f;
        return a;
    }
    Float f;
    public Float funIntToFloat1(Integer i){
        f=i.floatValue();
        return f;
    }
    public float funIntToFloat2(int i){
        float f;
        f=i;
        return f;
    }
}
public class IntToFloatAndFloatToInt {
    public static void main(String []args){
        FunctionClass fc=new FunctionClass();
        System.out.println(fc.funFloatToInt1(11.64f).getClass()+" "+fc.funFloatToInt1(11.64f));
        System.out.println(fc.funIntToFloat1(11).getClass()+" "+fc.funIntToFloat1(11));
        System.out.println(fc.funFloatToInt2(1.64f));
        System.out.println(fc.funIntToFloat2(91));
    }
}
