package com.company;

import java.util.Scanner;

public class Nested_Try_Catch  extends Exception{
    public static void main(String[] args){
        int [] marks = new int[9];
        marks[0] = 23;
        marks[1] = 45;
        marks[2] = 6;
        marks[3] = 16;
        marks[4] = 45;
        marks[5] = 57;
        marks[6] = 45;
        marks[7] = 37;
        marks[8] = 210;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Enter the value of Index:");
            int ind = sc.nextInt();
            try{
                System.out.println("Welcome to Index...");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                    System.out.println("Sorry this Index does not exist");
                    System.out.println("Exception in level 2");
                }
            }catch (Exception e){
                System.out.println("exception in level 1");
            }
        }
        System.out.println("Thanks for using this Program.");
    }
}
