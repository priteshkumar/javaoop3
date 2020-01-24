package com.upgrad.oop3;
import java.util.*;
import java.lang.Math;

public class ThrowDemo {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        try{
            System.out.println(power(a,b));
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public static long power(int n,int p) throws Exception{
        if (n < 0 || p < 0)throw new Exception("n or p should not be negative");
        else if(n == 0 && p ==0)throw new Exception("n and p should not be 0");
        else
            return (long)Math.pow(n,p);

    }
}
