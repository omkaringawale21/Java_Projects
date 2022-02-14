package com.company;
// Upload on th class for selection and convert to Java_Doc
/**
 * This class is to demostrate what javadoc is and how it is used when learn to JAVA.
 * This is <i>italic</i> world<p>This is a Paragraph</p>
 * @author Omkar (CodeWithOmkar)
 * @version 0.3
 * @since 2021
 * @see <a herf="https://docs.oracle.com/javase/7/docs/api/"  target="_blank">Java Docs</a>
 */
public class Java_Doc {
/**
 * This Methods shows exception handling
 * @param a This is a frist parameter
 * @param b This is a second parameter
 * @return Sum of the two integers
 * @throws Exception If i is 0
 * @deprecated This method is depricated use + Operator
 * */
    public  void add(int a, int b) throws Exception{
        System.out.println("The sum is : " + a+b);
    }

    public static void main(String[] args){
        System.out.println("This is my main method!");
    }
}
