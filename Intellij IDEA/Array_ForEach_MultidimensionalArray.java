package com.company;

import java.util.Scanner;

public class Array_ForEach_MultidimensionalArray {
    public static void main(String[] args){
        //Question-1
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element:marks) {
            sum = sum + element;
        }
        System.out.println(sum);*/

        //Question-2
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float element:marks) {
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array.");
        }
        else{
            System.out.println("The value is not present in the array");
        }*/

        //Question-3
        /*int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0; i<=mat1.length; i++){
            for (int j=0; j<=mat1[i].length; j++){
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println();
        }*/

        //Question-4
        /*int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for (int element:arr){
            System.out.println(element + " ");
        }*/

        //Question-5
        /*int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int e:arr) {
            if (e>max){
                max = e;
            }
            if (e<min){
                min = e;
            }
        }
        System.out.println("The value of maximum element in this array is : " + max);
        System.out.println("The value of minimum element in this array is : " + min);*/

        //Question-6
        boolean isSorted = true;
        int [] arr = {1, 2, 3, 4, 5, 34, 67, 76, 89};
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is Sorted");
        }
        else{
            System.out.println("The Array is not Sorted");
        }


    }
}
