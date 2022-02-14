package com.company;

import java.util.Scanner;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("Write");
    }
    @Override
    void refill(){
        System.out.println("Refill");
    }
    public void changeNib(){
        System.out.println("Changing the Nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class AbstractClassesAndInterfaces {
    public static void main(String[] args){
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        Human omkar = new Human();
        omkar.sleep();
        //omkar.eat();
        omkar.speak();
        //omkar.bite();
        //omkar.jump();

        Monkey m1 = new Human();
        m1.jump();
        m1.bite();

        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();
    }
}
