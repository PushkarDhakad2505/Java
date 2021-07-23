/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.ThreadExecutionPrevention;

/**
 *
 * @author HP
 */


class NormalClass extends Thread{
    
    NormalClass n2;
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }   
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
}

public class SleepMethod extends Thread{
    
    public static void main(String args[]) throws Exception {
        
        NormalClass n1=new NormalClass();
        
        n1.start();
        Thread.sleep(1000);
    }
}
