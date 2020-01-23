package com.upgrad.oop3;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{

            System.out.println(40/0); //generates ArithmeticException
            String val = null;
            //String res = val.toUpperCase(); //generates NullPointerException

        }
        catch(ArithmeticException e){
            System.out.println(" a number divided by zero tried in code. " +
                    "Please fix the division by zero error");
            e.printStackTrace();
        }
        catch(NullPointerException e){
            System.out.println(" Null reference being used. " +
                    "Please fix the null reference bug");
            e.printStackTrace();
        }
        catch(Exception e){   //place generic exception handler at last to avoid compile error, it blocks all exceptions
            //e.printStackTrace();
            System.out.println("Some other exception");
            e.printStackTrace();
        }
        System.out.println("out of try-catch blocks");
    }
}
