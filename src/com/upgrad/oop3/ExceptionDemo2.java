package com.upgrad.oop3;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class ExceptionDemo2 {
    public static void main(String[] args){
        String val = null;
       // Scanner scan = new Scanner(System.in);
        //int n = Integer.parseInt(scan.nextLine());
        //String nums = scan.nextLine();
        //scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //System.out.println(nums);
        String s = "ava";
        System.out.println(s.compareTo("ava"));
        try{
            val.toUpperCase();
            int ar[] = new int[3];
            ar[4] = 7;
        }
        catch(ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
            //return;
        }
        finally{ //finally block gets executed even if there is a "return" in try-catch
            System.out.println("finally block executes");
        }

        //logFile throws exception it needs to be handled in calling function
        try {
            logFile();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    public static void logFile() throws IOException {
        File fp = new  File("/home/mavixk/file3");
        Scanner inp = new Scanner(fp);

    }
}
