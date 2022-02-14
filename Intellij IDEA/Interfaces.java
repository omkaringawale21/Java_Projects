package com.company;

import java.util.Scanner;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x = 54;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){ System.out.println( "Pee Pee Poo Poo"); }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake.");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup.");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee.");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa poo poo poo poo.");
    }
}

public class Interfaces {
    public static void main(String[] args){
        AvonCycle cycleOmkar = new AvonCycle();
        cycleOmkar.applyBrake(54);
        cycleOmkar.speedUp(49);
        cycleOmkar.blowHorn();

        System.out.println(cycleOmkar.a);
        System.out.println(cycleOmkar.x);

        cycleOmkar.blowHornK3g();
        cycleOmkar.blowHornmhn();
    }
}
