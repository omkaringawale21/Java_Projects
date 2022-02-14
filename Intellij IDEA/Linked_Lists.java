package com.company;

import java.util.*;

public class Linked_Lists {
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(5, 1);

        l2.add(15);
        l2.add(18);
        l2.add(19);
        l2.add(14);

        System.out.println("Print L1 linked list : " + l1);
        System.out.println("Print L2 linked list : " + l2);

        //ADDALL
        l1.addAll(0, l2);
        System.out.println("Print L1 linked list after addall : " + l1);
        System.out.println("Print L2 linked list after addall : " + l2);

        //ADDLAST
        l1.addLast(656);
        System.out.println("Print L1 linked list after addlast : " + l1);
        System.out.println("Print L2 linked list after addlast : " + l2);

        //ADDFRIST
        l1.addFirst(455);
        System.out.println("Print L1 linked list after addfrist : " + l1);
        System.out.println("Print L2 linked list after addfrist : " + l2);

        System.out.println(l1.contains(15));
        System.out.println(l1.indexOf(1));
        System.out.println(l1.lastIndexOf(455));
        /*l1.clear();
        System.out.println(l1);*/
        System.out.println(l1);
        l1.set(1,566);
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
