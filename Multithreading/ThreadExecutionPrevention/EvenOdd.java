package Multithreading.ThreadExecutionPrevention;

public class EvenOdd {
    public static int num=10;
    public static int counter=1;
    public   void  printEven(){
        
        synchronized(this)
        {
            while(EvenOdd.counter<EvenOdd.num){
                while(EvenOdd.counter%2==1){
                    try{
                        wait();
                    }
                    catch(Exception e){
                    System.out.println(e);
                    }
                }
                System.out.println(EvenOdd.num);
                EvenOdd.counter++;
                notifyAll();
            
        }  
    }
}
    public   void  printOdd(){
        synchronized(this)
        {
            while(EvenOdd.counter<EvenOdd.num){
                while(EvenOdd.counter%2==0){
                    try{
                        wait();
                    }
                    catch(Exception e){
                    System.out.println(e);
                    }
                }
                System.out.println(EvenOdd.num);
                EvenOdd.counter++;
                notifyAll();
        }   
        
    }
}
        
    public static void main(String args[]){
        
        int num=10;
        
        EvenOdd obj=new EvenOdd();
        
        class T1 extends Thread{
            public void run(){
                obj.printEven();
            }
            
        }
        class T2 extends Thread{
            public void run(){
                obj.printOdd();
            } 
        }
        T1 t1=new T1();
        T2 t2=new T2();
        t1.start();
        t2.start();
        
    } 
}
        }