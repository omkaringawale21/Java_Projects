package com.company;

import java.util.Scanner;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("This is Meth1");
    }
    public void meth2() {
        System.out.println("This is Meth2");
    }
    public void meth3() {
        System.out.println("This is Meth3");
    }
    public void meth4() {
        System.out.println("This is Meth4");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args){
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
