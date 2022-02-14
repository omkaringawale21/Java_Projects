package com.company;

import java.util.*;

public class Calender_Class {
    public static void main(String[] args){
        Calendar c =  Calendar.getInstance();
        System.out.println("Current year is : " + c.get(Calendar.YEAR));
        System.out.println("Current month is : " + c.get(Calendar.MONTH));
        System.out.println("Current day is : " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current day is : " + c.get(Calendar.DATE));
        System.out.println("Current hour is : " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is : " + c.get(Calendar.MINUTE));
        System.out.println("Current second is : " + c.get(Calendar.SECOND));

        // add() method
        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years : " + c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years : " + c.getTime());
        c.add(Calendar.MONTH, 2);
        System.out.println("After 2 months : " + c.getTime());

        // getWeeksInWeekYear() method
        System.out.println("The maximum weeks present in this year : " + c.getWeeksInWeekYear());

        //getMaximum() method
        System.out.println("The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));

    }
}
