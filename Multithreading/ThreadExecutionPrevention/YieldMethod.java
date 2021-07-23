package Multithreading.ThreadExecutionPrevention;

import static Multithreading.ThreadExecutionPrevention.YieldMethod.y;

    public class YieldMethod extends Thread{
        static YieldMethod y;
    public static void main(String args[]) {
         y=new YieldMethod();
        NormalClass n1=new NormalClass();
        NormalClass2 n2=new NormalClass2();
        n1.start();
        n2.setPriority(MIN_PRIORITY);
        n2.start();
    }
}
class NormalClass extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                if(i%2==0)
                {
                    System.out.println(i);   
                
                    synchronized(y)
                     {
                         notify();
                     }
                    
                    
                }
                else
                {
                     synchronized(y)
                     {
                         y.wait();
                     }
                }
                
                //Thread.yield();//it gives priority to thread n2
            }   
        }
        catch(Exception e){
            System.out.println(e);   
        }
    }
}
class NormalClass2 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                if(i%2!=0){
                    System.out.println(i);
                    synchronized(y)
                     {
                         y.notify();
                     }
                }
                    else
                    {
                      synchronized(y)
                     {
                         y.wait();
                     }
                      
                }
                
                
                
                
                System.out.println(i);
            }   
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}