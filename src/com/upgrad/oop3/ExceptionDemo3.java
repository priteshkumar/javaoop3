package com.upgrad.oop3;
import java.util.*;

class InvalidUserException extends RuntimeException{
    String msg;

    public InvalidUserException(String msg){
        this.msg = msg;
    }

    public String toString(){
        return this.msg + " exception occured";
    }
}

public class ExceptionDemo3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
