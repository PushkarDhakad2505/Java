
package BasicOfJavaProgramming;

class XClass{
    int x;
    void setVar(int x){
        this.x=x;
    }
    public int getVar(){
        return x;
    }
}
class YClass{
    int y;
    public void setVar(int y){
        this.y=y;
    }
    public int  getVar(){
        return y;
    }
}

public class UsingMultipleClasses {

    public static void main(String []args){
        
        XClass x1=new XClass();
        YClass y1=new YClass();
        x1.setVar(10);
        y1.setVar(20);
        System.out.println("from x Class"+x1.getVar());
        System.out.println("from y Class"+y1.getVar());
        
        
    }







    
}
