package com.company;

import java.util.Scanner;

public class Variables_Literals_UserInput {

        public static void main(String[] args){
            //Question-1
            //int a = 4;
            //int b = 17;
            //int c = 6;
            //int sum = a + b + c;
            //System.out.println(sum);

            //Question-2
            //float subject1 = 45;
            //float subject2 = 95;
            //float subject3 = 48;
            //float cpga = (subject1 + subject2 + subject3)/30;
            //System.out.println(cpga);

            //Question-3
            //System.out.println("Enter your name : ");
            //Scanner sc = new Scanner(System.in);
            //String name = sc.next();
            //System.out.println("Hello" + name + " Welcome to Kolhapur City.");

            //Question-4
            System.out.println("Enter your number : ");
            Scanner sc = new Scanner(System.in);
            System.out.println(sc.hasNextInt());

        }
}
