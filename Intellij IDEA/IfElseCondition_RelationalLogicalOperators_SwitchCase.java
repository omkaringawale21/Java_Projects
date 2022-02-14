package com.company;

import java.util.Scanner;
import java.util.Random;

public class IfElseCondition_RelationalLogicalOperators_SwitchCase {
    public  static  void main(String[] args){
        //Question-1
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 10){
            System.out.println("I am 10");
        }
        else{
            System.out.println("I am not 10");
        }*/

        //Question-2
        /*byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks in Physics : ");
        m1 = sc.nextByte();

        System.out.println("Enter Your Marks in Chemistry : ");
        m2 = sc.nextByte();

        System.out.println("Enter Your Marks in Mathematics : ");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("Your Overall Percentage is " + avg);

        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted.");
        }else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }*/

        //Question-3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your income in lakhs per annum :");
        float tax = 0;
        float income = sc.nextFloat();

        if (income<=2.5f){
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5.0f){
            //tax = tax + 0;
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5.0f && income<=10.0f){
            //tax = tax + 0;
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if (income>10.0f){
            //tax = tax + 0;
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is : " + tax);*/

        //Question-4
        System.out.println("Enter the number of day : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1 :  System.out.println("Monday") ; break;
            case 2 :  System.out.println("Tuesday"); break;
            case 3 :  System.out.println("Wednesday"); break;
            case 4 :  System.out.println("Thursday"); break;
            case 5 :  System.out.println("Friday"); break;
            case 6 :  System.out.println("Saturday"); break;
            case 7 :  System.out.println("Sunday"); break;
        }

        //Question-5
        /*Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if (website.endsWith(".org")){
            System.out.println("This is an Organisational Website.");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is an Commercial Website.");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian Website.");
        }*/


    }
}
