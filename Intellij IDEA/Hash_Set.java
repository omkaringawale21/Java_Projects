package com.company;

import java.util.*;

public class Hash_Set extends  Thread{
    public static void main(String[] args){
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        System.out.println(myHashSet);   //Add elements in myHashSet

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        System.out.println("MyHashSet before removing any element :" + myHashSet);
        System.out.println("MyHashSet after removing any element :");
        myHashSet.remove(3);
        System.out.println(myHashSet);    //After removing the element

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        HashSet<Integer> myHashSet1 = new HashSet<>(55, 0.99f);
        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet1.isEmpty());   //Checking myHashSet is Empty or not

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        System.out.println("myHashSet before clearing : " + myHashSet);
        myHashSet.clear();
        System.out.println("myHashSet after clearing : " + myHashSet);  //Clearing the myHashSet

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);

        System.out.println("The size of myHashSet is : " + myHashSet.size());   //Checking the size of myHashSet

    }
}
