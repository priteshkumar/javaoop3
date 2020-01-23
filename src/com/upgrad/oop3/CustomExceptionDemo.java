package com.upgrad.oop3;
import java.util.ArrayList;
import java.util.regex.*;

class InvalidNameException extends Exception{
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

    }

    public static void verifyStudentName(String name) throws InvalidNameException{
        if(Pattern.matches(".*\\d",name) == true){
            throw new InvalidNameException("Invalid student name. name has numeric digits..");
        }
    }
}
