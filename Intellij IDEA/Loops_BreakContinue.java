package com.company;

import java.util.Scanner;

public class Loops_BreakContinue {
    public static void main(String[] args){
        //Question-1
        /*int n = 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//        int n = 5;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*int n = 1;
        for (int i=5; i>=n; i--){
            for (int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Question-2
        /*int sum = 0;
        int n = 4;
        for (int i=0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of Even numbers is : ");
        System.out.println(sum);*/

        //Question-3
        /*int n = 5;
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }*/

        //Question-4
        /*int n = 5;
        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);*/

        //Question-5
        /*int n = 8;
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum += n*i;
        }
        System.out.println(sum);*/

    }
}
