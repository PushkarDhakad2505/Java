
package DesignePatten;
interface CarName{
    public void getCarName();   
}
class Tesla implements CarName{
    public void getCarName(){
        System.out.println("Tesla Model 3 :)");
    }
}

class Tata implements CarName{
    public void getCarName(){
        System.out.println("Tata Nexon ev :)");
    }
}

class BMW implements CarName{
    public void getCarName(){
        System.out.println("BMW X series :)");
    }
}
class CarFactory {
        public CarName getCar(String car){
            if(car=="TESLA" ){
                return new Tesla();
            }
            else if(car=="BMW"){
                return new BMW();
            }
            else if(car=="TATA")
            {
                return new Tata();
            }
           return null;
        }
}
public class FactoryPattern{

    public static void main(String []args){
    
        CarFactory c=new CarFactory();
       CarName cName1= c.getCar("TESLA");
        cName1.getCarName();
       CarName cName2= c.getCar("TATA");
        cName2.getCarName();
       CarName cName3= c.getCar("BMW");
        cName3.getCarName();
        
    }
}