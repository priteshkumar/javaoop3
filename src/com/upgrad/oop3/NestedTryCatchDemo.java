package com.upgrad.oop3;

public class NestedTryCatchDemo {
    public static void main(String[] args){
        try{
            System.out.println("Inside parent try block");
            try{
                String val = null;
                String res = val.toUpperCase();
            }
            catch(NullPointerException e1){ //nested catch handles this exception
                System.out.println("inside nested catch block 1");
                System.out.println("Null pointer exception . Please fix code");
            }
            try{
                System.out.println(40/0);
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("inside nested catch block2");
                System.out.println("ArrayIndex out of bounds exception");
            }
        }
        catch(ArithmeticException e3){ //since nested try-catch block2 didnt handle this exception,control comes here
            System.out.println("inside main catch block");
            System.out.println("Arithmetic exception");
        }
        catch(NullPointerException e4){
            System.out.println("inside main catch block");
            System.out.println("Nullpointer exception");
        }
        System.out.println("out of try-catch block");
    }
}
