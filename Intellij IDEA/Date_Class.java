package com.company;

import java.util.*;

public class Date_Class {
    public static void main(String[] args){
        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms :" + System.currentTimeMillis());

        Date d = new Date();
        System.out.println("The current date is : " + d);
        Date d1 = new Date(2022, 12, 24);
        System.out.println("The date calculated form milisecond is :" + d1);

        // Date Class Methods
        Date d2 = new Date(2022, 12, 24);   // Both dates are different
        System.out.println(d2.compareTo(d));       // If returns 0 both dates are equal else return 1.

        // getTime() method
        System.out.println("The number of miliseconds passed since jan 1, 1970 : " + d2.getTime());

        // getYear() method
        System.out.println("The current year is : " + d.getYear());   // 2022 - 1900 = 122

        // getDate() method
        System.out.println("The current date is : " + d.getDate());

        // getHours() method
        System.out.println("The current minute is : " + d.getHours());

        // getMinutes() method
        System.out.println("The current minute is : " + d.getMinutes());

        // getSeconds() method
        System.out.println("The current seconds is : " + d.getSeconds());

    }
}
