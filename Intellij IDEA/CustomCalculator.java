package com.company;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 and 9!";
    }

    @Override
    public String getMessage(){
        return "Cannot add 8 and 9!";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input Cannot be greater than 100000";
    }

    @Override
    public String getMessage(){
        return "Input Cannot be greater than 100000";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage(){
        return "Cannot divide by 0";
    }
}

class MaxMultiplyInputException extends Exception{
    @Override
    public String toString(){
        return "Input can be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage(){
        return "Input can be greater than 7000 while multiplying";
    }
}

class CustomCalculator1{
    public static double add(int a, int b) throws InvalidInputException, MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (a==8 || b==9){
            throw new InvalidInputException();
        }
        int result = a + b;
        return result;
    }

    public static double subtract(int a, int b) throws MaxInputException, InvalidInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (a==8 || b==9){
            throw new InvalidInputException();
        }
        int result = a - b;
        return result;
    }

    public static double multiply(int a, int b) throws MaxInputException, MaxMultiplyInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        int result = a * b;
        return result;
    }

    public static double divide(int a, int b) throws MaxInputException, CannotDivideByZeroException, MaxMultiplyInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if (b==0){
            throw new CannotDivideByZeroException();
        }
        else if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        int result = a / b;
        return result;
    }
}

public class CustomCalculator {
    public static void main(String[] args) throws MaxInputException, InvalidInputException, MaxMultiplyInputException, CannotDivideByZeroException{
        CustomCalculator1 c = new CustomCalculator1();

        //c.add(8,9);
        //c.divide(6,0);
        //c.divide(60000000, 40);
        double sub = c.subtract(24,8);
        System.out.println("The subtraction is : " + sub);
        //c.multiply(4, 5);
        //c.multiply(40000, 5);
    }
}
