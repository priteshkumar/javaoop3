package com.upgrad.oop3;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        int[] a,c; //both are arrays
        int d[],b; // d is array b is integer

        int[] random = {9,-1,23,1,2,3,4,7};
        int[] values = new int[3];
        values[0] = 23;
        values[1] = 32;
        values[2] = 34;

        //object array can store string,integer objects
        Object[] obs = new Object[4];
        obs[0] = new String("devops");
        obs[1] = new String("aws");
        obs[2] = new Integer(10);
        obs[3] = 20;

        System.out.println(obs[3].getClass());
        for(Object ob:obs){
            System.out.println(ob);
        }

        Arrays.sort(random);
        int flag = Arrays.binarySearch(random,23);
        System.out.println(flag);
    }

}
