package com.company;

import java.util.Scanner;
//Question-1
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }

    public double volume(){
        return Math.PI* radius* radius* height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public double rectArea(){ return this.length * this.breadth; }
}

public class Oop_Constructors {
    public static void main(String[] args){
        //Question-1
        System.out.println("Enter the value of radius and height : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Cylinder myCylinder = new Cylinder(a, b);
        /*myCylinder.setRadius(13);
        System.out.println(myCylinder.getRadius());
        myCylinder.setHeight(16);
        System.out.println(myCylinder.getHeight());*/
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        //Question-2
        //Rectangle r = new Rectangle();
        System.out.println("Enter the value of length and breadth : ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        Rectangle r = new Rectangle(c, d);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println(r.rectArea());

    }
}
