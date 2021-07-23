
package GarbageCollectionPrograms;

public class IslandOfIsolation {
    IslandOfIsolation i;
    public static void main(String []args){
        

        IslandOfIsolation i1=new IslandOfIsolation();
        IslandOfIsolation i2=new IslandOfIsolation();
        IslandOfIsolation i3=new IslandOfIsolation();
    //no obj eligible for gc
        i1.i=i2;
        i2.i=i3;
        i3.i=i1;
    //no obj eligible for gc     
        i1=null;//no obj eligible for gc
        i2=null;//no obj eligible for gc
        i3=null;//all three  object are eligible for gc
        //because all three are connected internally they have no connection with outside object
        
    }
}
