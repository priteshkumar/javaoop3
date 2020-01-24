package com.upgrad.oop3;
import java.util.*;

/** Demonstrates arraylist of arraylist use
 * creates 2d arraylist
 * gets values for random indexes in 2d arraylist
 */
public class ArrayListDemo2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(2);

        for(int i=0;i < 2;i++){
            ArrayList<Integer> alist = new ArrayList<Integer>();
            int count = inp.nextInt();
            System.out.println(count);

            for(int j=0;j < count;j++){
                int val = inp.nextInt();
                alist.add(val);
            }
            list.add(alist);
        }

        printList(list);
    }

    public static void printList(ArrayList<ArrayList<Integer>> list){
        System.out.println("printing arraylist");
        for(int i=0; i < list.size();i++){
            ArrayList<Integer> alist = list.get(i);
            for(int j=0;j < alist.size();j++){
                System.out.print(alist.get(j) + " ");
            }
            System.out.println();
        }
    }

    static public void solveQuery(){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);

        for(int i=0;i < n;i++){
            ArrayList<Integer> alist = new ArrayList<Integer>();
            int count = inp.nextInt();
            //System.out.println(count);
            for(int j=0;j < count;j++){
                int val = inp.nextInt();
                alist.add(val);
            }
            list.add(alist);
        }

        int q = inp.nextInt();
        int lnum,pos;
        for(int i=0;i < q;i++){
            lnum = inp.nextInt();
            pos = inp.nextInt() - 1;
            ArrayList<Integer> alist = list.get(lnum -1);
            if(alist.size() > pos)System.out.println(alist.get(pos));
            else System.out.println("ERROR!");
        }
    }
}
