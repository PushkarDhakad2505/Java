package Multithreading.WaysToCreateThread;

public class ImplimentRunnableInterface implements Runnable{

    public void run() {
        for(int i=0;i<1;i++){
            System.out.println(Thread.currentThread().getName()+   "THREAD"); 
        }
    }
    
    public static void main(String []args){
        ImplimentRunnableInterface i=new ImplimentRunnableInterface();
        ImplimentRunnableInterface i2=new ImplimentRunnableInterface();
        
        Thread t1=new Thread(i);
        Thread t2=new Thread(i);
        t1.start();
        t2.start();
        for(int x=0;x<10;x++){
            System.out.println("MAIN");
        }
    }
    
}
