
package Multithreading.WaysToCreateThread;


public class ExtendingThreadClass extends Thread {
    
    public void run(){
        System.out.println("Hi");
    }
    public static void main(String args[]){
        ExtendingThreadClass e=new ExtendingThreadClass ();
        e.start();
        System.out.println("MAIN");
    }
    
    
}
