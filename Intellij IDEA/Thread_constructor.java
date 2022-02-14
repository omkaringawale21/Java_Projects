package com.company;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    @Override
    public void run(){
        int i =34;
        System.out.println("Thank You!");
    }
}

class h1 implements Runnable{
    @Override
    public void run(){
        int j = 1;
        while (j<233) {
            System.out.println("Hello Omkar Thank You So Much");
            j++;
        }
    }
}

public class Thread_constructor extends Thread{
    public static void main(String[] args){
        Mythr t1 = new Mythr("Omkar");
        Mythr t2 = new Mythr("Tejas");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());

        h1 obj1 = new h1();
        Thread h = new Thread(obj1);
        h.start();
    }
}
