package com.company;

import java.io.*;
import java.lang.Thread;

class d1 extends Thread {
    public void run() {
        //Question-1
        /*try{
            for (int i=1; i<=5; i++){
                System.out.println("Child Thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Thread is Running");
      }*/
        //Question-2
        /*for (int i=0; i<10; i++){
            System.out.println(i);
        }*/

        //Question-3
        int f = 0;
        while (f <= 300) {
            try {
                System.out.println("Thank You: ");
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            f++;
        }
    }
}

class d2 extends Thread{
    public void run(){
        int j = 0;
        while(j <= 233){
            try {
                System.out.println("My Thank You: ");
                Thread.sleep(555);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            j++;
        }
    }
}

public class ThreadMethod extends Thread{
    public static void main(String[] args){
        d1 g1 = new d1();
        d2 g2 = new d2();
        g1.start();
        g1.interrupt();
        g1.getContextClassLoader();
        g1.getState();
        g2.start();
        g2.interrupt();
        g2.getContextClassLoader();
        g2.getState();
        //System.out.println("Main Thread");
    }
}
