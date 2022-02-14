package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class myGeneric<T1, T2>{
    int val;
    private  T1 t1;
    private  T2 t2;
    public myGeneric(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }

    public T2 getT2() {
        return t2;
    }
    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }

}

public class Java_Generics {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(54);
        arrayList.add(212);
        arrayList.add(43);
        arrayList.add(98);
        arrayList.add(11);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Index : ");
        int ind = s.nextInt();
//        int a = (int) arrayList.get(ind);
        int a = arrayList.get(ind);
        System.out.println("The value entered in the arraylist is : " + a);

        // Generics Java
        myGeneric<String, Integer> g1 = new myGeneric<>(223, "My name is Omkar ", 21);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);

    }
}
