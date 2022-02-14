package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}

class ArithmeticException extends Exception{
    @Override
    public String toString(){
        return "You cannot divided by zero!";
    }

    @Override
    public String getMessage(){
        return "You cannot divided by zero!";
    }
}

public class Throw_Throws extends Exception{

    public static double area(int r) throws NegativeRadiusException{
        if (r < 0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        //Made by Omkar
        if (b == 0){
            throw new ArithmeticException();
        }
        int result = a / b;
        return result;
    }

    public static void main(String[] args) throws ArithmeticException, NegativeRadiusException {
        //Shivam - uses divide function created by Harry

        System.out.println("Enter the Radius for given Area Calculation : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the Two parameters : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            double ar = area(r);
            System.out.println("Result of given Area : " + ar);
            int c = divide(a, b);
            System.out.println("The result of two integers is : " + c);
        }
        catch (Exception f){
            System.out.println("Exception!");
            System.out.println(f.toString());
            System.out.println(f.getMessage());

        }

    }
}
