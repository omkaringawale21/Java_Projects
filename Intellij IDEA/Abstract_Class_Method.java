package com.company;

import java.util.Scanner;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am base2 constructor.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning have great day.");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon.");
    }
}

abstract class Child3{
    Child3(){ System.out.println("Hiii...I am an abstract class Child3!"); }
    public void om(){
        System.out.println("This is a Child3 abstract class");
    }
    abstract public void th();
}

class Child4 extends Child3{
    @Override
    public void th(){System.out.println("I am very good.");}
}

public class Abstract_Class_Method {
    public static void main(String[] args){
        //Parent2 obj = new Parent2();....Error

        Child2 obj1 = new Child2();
        obj1.greet();
        obj1.greet2();
        obj1.sayHello();
        //obj1.th();....Error

        Child4 obj2 = new Child4();
        obj2.th();
        obj2.om();
    }
}