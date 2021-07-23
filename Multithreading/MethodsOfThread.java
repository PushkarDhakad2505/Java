package Multithreading;

public class MethodsOfThread extends Thread {
    
    public void run(){
        System.out.println("Hi");
    }
    public static void main(String args[]){
        MethodsOfThread e=new MethodsOfThread ();
      
        System.out.println("MAIN");
        System.out.println(e.getName());
        System.out.println(e.isAlive());
        System.out.println(e.isDaemon());
        e.setName("newThread");
        System.out.println(e.getName());
        System.out.println(e.getPriority());
        
        e.setPriority(MIN_PRIORITY);
        e.setPriority(MAX_PRIORITY);
        e.setPriority(NORM_PRIORITY);
        e.setPriority(9);
        System.out.println(e.getPriority());
          e.start();
    
    
    
    
    
    }
    
    
}




