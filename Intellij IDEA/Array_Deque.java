package com.company;

import java.util.*;

public class Array_Deque {
    public static void main(String[] args){
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(54);
        ad1.add(9);
        ad1.addFirst(21);
        ad1.offerFirst(34);
        System.out.println(ad1);  //Insertion at frist

        ad1.addLast(22);
        ad1.offerLast(55);
        System.out.println(ad1);    //Insertion at last

        //Accessingan element at frist
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());

        //Accessingan element at last
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());

        //Remove element at frist
        System.out.println(ad1.removeFirst());
        System.out.println(ad1.pollFirst());
        System.out.println(ad1);

        //Remove element at last
        System.out.println(ad1.removeLast());
        System.out.println(ad1.pollLast());
        System.out.println(ad1);
    }
}
