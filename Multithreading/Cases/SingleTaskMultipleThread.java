/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.Cases;

/**
 *
 * @author HP
 */
public class SingleTaskMultipleThread extends Thread{
    
    public void run(){
        for(int i=0;i<10;i++){
    
            System.out.println(Thread.currentThread().getName()+" Hi");
        
        }
    }
    public static void main(String args[]) throws InterruptedException{
        SingleTaskMultipleThread t=new SingleTaskMultipleThread();
        t.start();
        
        SingleTaskMultipleThread t2=new SingleTaskMultipleThread();
        t2.start();
    }
    
    
    
    
}
