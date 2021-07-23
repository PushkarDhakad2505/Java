package GarbageCollectionPrograms.FinaliseMethod;
public class ProgrammerCalledFinalMethod {

    public static void main(String []args) throws Throwable{
        
            ProgrammerCalledFinalMethod  m1=new ProgrammerCalledFinalMethod();
            ProgrammerCalledFinalMethod m2 = new ProgrammerCalledFinalMethod();   

            m1.finalize();//programmer called finalise method but it will work as normal method
            m1=null;
            System.gc();

        }
      public void finalize(){
        System.out.println("Finalize Method Called");
    }

    
}
