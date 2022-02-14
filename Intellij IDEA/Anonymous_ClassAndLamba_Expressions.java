package com.company;

// This is for Anonymous Functions
abstract class Vehicle{
    abstract void drive();
}

//@FunctionalInterface
interface Man{
    public void walk();
}

// Lambda Expression
//@FunctionalInterface
//interface LambaExp{
//    void meth1(int a, int b);
//}

public class Anonymous_ClassAndLamba_Expressions {
    public  static  void main(String[] args){

        // This is anonymous fuction for abstract class
        Vehicle car = new Vehicle() {
            @Override
            public void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();

        // This is anonymous fuction for interface
        Man Omkar = new Man(){
            @Override
            public void walk(){
                System.out.println("Omkar walks....");
            }
        };
        Omkar.walk();

        // Lambda Expression for Interface
//        LambaExp obj = (int a, int b) ->{
//              System.out.println("The value os a and b is : " + a + ", " + b);
//        };
//        obj.meth1(5,10);


    }
}
