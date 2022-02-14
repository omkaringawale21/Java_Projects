package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage(){
        return "Make sue that the value of age entered is not correct";
    }
}

public class ExceptionClass {
    public static void main(String[] args) throws MaxAgeException {
        System.out.println("Enter the your age :");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a > 125){
            try{
              //throw new MyException();
              throw new MaxAgeException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished!");
            }
            System.out.println("Yes Finished!");
        }
        else if (125 > a){
            System.out.println("Yes, you are under the 125 age!");
        }

    }
}
