package com.company;

import java.util.Scanner;

public class OperatorsExpressions_Associativity_DataTypes {
    public static void main(String[] args){
        //Question-1
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //System.out.println(a>8);

        //Question-2
        //float a = 7/4.0f * 9/2.0f;
        //System.out.println(a);

        //Question-3
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
