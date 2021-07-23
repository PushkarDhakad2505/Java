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
public class JoinMethod extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}
   System.out.println(Thread.currentThread().getName()+" "+i);  
  }  
 }  
public static void main(String args[]){  
 JoinMethod t1=new JoinMethod();  
 JoinMethod t2=new JoinMethod();  
 JoinMethod t3=new JoinMethod();  
 t1.start();  
 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t3.start();  
 }  
}  
