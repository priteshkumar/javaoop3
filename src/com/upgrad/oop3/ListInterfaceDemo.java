package com.upgrad.oop3;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.File;
import java.util.Scanner;


public class ListInterfaceDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("/home/mavixk/file1");
        Scanner input = new Scanner(f1);
        List<Integer> ilist1 = new ArrayList<Integer>(10);
        List<Integer> ilist2 = new LinkedList<Integer>();

        while(input.hasNextInt()){
            ilist1.add(input.nextInt());
        }

        input.close();

        File f2 = new File("/home/mavixk/file2");
        input = new Scanner(f2);
        while(input.hasNextInt()){
            ilist2.add(input.nextInt());
        }

        input.close();

        System.out.println("=====print ArrayList=====");
        printList(ilist1);
        System.out.println("=====print LinkedList=====");
        printList(ilist2);

    }

    public static void printList(List<Integer> list){
        for(Integer val:list){
            System.out.println(val);
        }
    }

}
