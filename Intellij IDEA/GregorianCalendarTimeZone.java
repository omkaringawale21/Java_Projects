package com.company;

import java.util.*;

public class GregorianCalendarTimeZone extends Thread{
    public static void main(String[] args){
        GregorianCalendar cal = new GregorianCalendar();

        // isLeapYear(int year)     returns boolean value
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2024));

        // roll(int field, boolean up)
        System.out.println("Date before rolling : " + cal.getTime());
        cal.roll(Calendar.MONTH,true);
        cal.roll(Calendar.DATE,false);
        cal.roll(Calendar.YEAR,true);
        System.out.println("Date after rolling : " + cal.getTime());

        // hashcode()
        System.out.println("Calendar : " + cal.getTime());
        System.out.println("The Hashcode for this calendar is : " + cal.hashCode());

        // Timezone().getAvailableIDs()[]
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[91]);
        System.out.println(TimeZone.getDefault());

        // Date(Long.MIN_VALUE)  &  Date(Long.MAX_VALUE)
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

    }
}
