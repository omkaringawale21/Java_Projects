package com.company;

class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i = 43;
        //System.out.println("Thank You: " + this.getName());
        while (i<=43){
            System.out.println("Thank You: " + Thread.currentThread().getName());
            System.out.println("Thank You: " + Thread.currentThread().getId());
            System.out.println("Thank You: " + Thread.currentThread().getContextClassLoader());
            System.out.println("Thank You: " + Thread.currentThread().getState());
            System.out.println("Thank You: " + Thread.currentThread().getThreadGroup());
            System.out.println("Thank You: " + Thread.currentThread().getUncaughtExceptionHandler());
            i++;
        }
    }
}
public class ThreadPriorities extends Thread{
    public static void main(String[] args){
        Mythr1 t1 = new Mythr1("Sidhesh1");
        Mythr1 t2 = new Mythr1("Sidhesh2");
        Mythr1 t3 = new Mythr1("Sidhesh3");
        Mythr1 t4 = new Mythr1("Sidhesh4");
        Mythr1 t5 = new Mythr1("Sidhesh5 (MostImportant)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t5.getThreadGroup();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
