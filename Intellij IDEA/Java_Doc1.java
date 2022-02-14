package com.company;

/**
 * This is demonstration class for given class
 */
public class Java_Doc1 {

    /**
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args){
        System.out.println("This is a main Method!");
    }

    /**
     * This Methods shows exception handling
     * @param i This is a frist parameter
     * @param j This is a second parameter
     * @return Sum of the two integers
     * @throws Exception If i is 0
     * @deprecated This method is depricated use + Operator
     */
    public int add(int i, int j) throws Exception{
        if (i==0){
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}
