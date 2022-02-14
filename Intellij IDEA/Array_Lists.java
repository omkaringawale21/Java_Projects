package com.company;

import java.util.*;

public class Array_Lists {
    public static void main(String[] args){
        //ADDING AN ELEMENT
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5, 55);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        System.out.println(l1);
        System.out.println(l2);

        //REMOVING AN ELEMENT
        l1.remove(4);
        System.out.println("Removing the value of index 4 : " + l1);

        // CHECKING THE ARRAY CONTAIN OK OR NOT
        System.out.println("Checking the value of contain 7 : " + l1.contains(7));
        System.out.println("Checking the value of contain 2: " + l1.contains(2));

        //MERGING TOW ARRAYS
        l1.add(63);
        System.out.println("Adding the value of index 6 : " + l1);
        System.out.println("Print Array List of l2 : " + l2);
        l1.addAll(l2);
        System.out.println("L1 arraylist after merging : " + l1);
        System.out.println("L2 arraylist after merging : " + l2);
        //IF YOU WANT L2 LIST AT STARTING :
        l1.addAll(0, l2);
        System.out.println("L1 array starting at L2 array : " + l1);
        System.out.println("L2 arraylist : " + l2);

        //INDEXOF OF AN ARRAY
        System.out.println("L1 arraylist : " + l1);
        System.out.println("The frist occurrence of 3 in l1 is at index : " + l1.indexOf(3));
        System.out.println("The last occurrence of 4 in l1 is at index : " + l1.lastIndexOf(4));

    }
}
