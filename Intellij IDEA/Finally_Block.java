package com.company;

public class Finally_Block {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return  c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of function.");
        }
        return 0;
    }

    public static void main(String[] args){
        int k = greet();
        System.out.println(k);

        int a = 20;
        int b = 2;
        while (true){
            try{
                System.out.println(a / b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally value for b = " + b);
            }
            b--;
        }

    }
}
