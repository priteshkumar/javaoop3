package com.upgrad.oop3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
import java.io.File;

class InvalidNameException extends RuntimeException{
    private String message;
    public InvalidNameException(String s){
        this.message = s;
    }

    public String toString(){
        return "InvalidNameException occured: " + this.message;
    }

}


public class CustomExceptionDemo {
    public static void main(String[] args){

        ArrayList<String> students = new ArrayList<String>(3);
        students.add("mavixk");
        students.add("casper1234");
        students.add("coder-moon");

        try {
            testExit();
        }
        catch (IOException e) { //must to specify the catch block as called function throws IOException
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

        try{
            for(String name:students){
                verifyStudentName(name);
            }
        }
        catch(InvalidNameException e){
            System.out.println(e);
        }
        finally{
            System.out.println("student name verification completed..");
        }

        try {
            fun(50);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public static void verifyStudentName(String name) {
        if(Pattern.matches(".*\\d",name) == true){
            throw new InvalidNameException("Invalid student name. name has numeric digits..");
        }
    }

    static void fun(int n) {
        if (n < 60)
            throw new ArithmeticException("Not Eligible");
        else
            System.out.println("Eligible for pension");
    }

    static void testExit() throws IOException {
        try {
            File f = new File("/home/mavixk/file1");
            Scanner input = new Scanner(f);
            int count = 0;
            while(input.hasNextInt()){
                System.out.println(input.nextInt());
                count++;
                if (count == 1)break;
            }
            input.close();
            System.out.print(50 / 0);
            System.exit(0);
        }
        finally {
            System.out.println("code inside finally block");
        }
    }
}
