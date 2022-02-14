package com.company;

import java.util.Scanner;

class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

class Phone {
    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }

//    public void music(){ System.out.println("Playing music..."); }
    public void music(){};
}

class SmartPhone extends Phone{
    public void music(){System.out.println("Turn Off the music..."); }
    public void on(){
        System.out.println("Turning on smartphone...");
    }
}

public class Inheritance_ConstructorsInheritance_MethodOveriding_Dyna {
    public static void main(String[] args){
        //Question-1
        //Circle obj1 = new Circle(12);
        System.out.println("Enter the value of Radius and Height :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        Cylinder1 obj = new Cylinder1(r,h);
        System.out.println(obj.area());
        System.out.println(obj.volume());
        //Circle obj = new Cylinder1(12,4);.....Allowed

        //Question-2
//        Phone obj1 = new SmartPhone();
        SmartPhone obj1 = new SmartPhone();
        //SmartPhone obj = new Phone();......Not Allowed

        obj1.showTime();
        obj1.on();
        obj1.music();
    }
}
