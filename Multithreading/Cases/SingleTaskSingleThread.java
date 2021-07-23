/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.Cases;


public class SingleTaskSingleThread extends Thread {
    
     public void run(){
        System.out.println("Hi");
    }
    public static void main(String args[]){
        SingleTaskSingleThread t=new SingleTaskSingleThread();
        t.start();
    }

}