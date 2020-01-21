package com.upgrad.oop3;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 15, 6, 25, 1, 11, 13};
        int[] arr1 = {2, 2, 2, 2, 2};
        int[] arr2 = {9, 3, 14, 22, 1, -6, 18, 15};
        int[] arr3 = {2,1,1,2,1};
        thirdMaxInteger(arr1);
        thirdMaxInteger(arr);
        thirdMaxInteger(arr2);
        thirdMaxInteger(arr3);
    }

    static void thirdMaxInteger(int[] arr) {
        // Write your code here
        if (arr.length < 3) System.out.println("The array doesn't have a third maximum element");
        else {
            Arrays.sort(arr);
            int n = arr.length;
            //System.out.println(Arrays.asList(arr));
            if (arr[n - 1] > arr[n - 2] && arr[n - 2] > arr[n - 3])
                System.out.println("third max is: " + arr[n - 3]);
            else {
                int j = 0;
                int sm = arr[0];
                while (arr[j] < arr[n - 1]) {
                    sm = arr[j];
                    j++;
                }

                j = 0;
                int tm = arr[0];
                while (arr[j] < sm) {
                    tm = arr[j];
                    j++;
                }

                if(arr[n-1] > sm && sm > tm)System.out.println(tm);
                else System.out.println("The array doesn't have a third maximum element");
            }
        }
    }

    public static void thirdMaxv2(int[] arr) {

        int first, sec, third;
        if (arr.length < 3) System.out.println("The array doesn't have a third maximum element");
        else {

            first = arr[0];
            for (int val : arr) {
                if (val > first) {
                    first = val;
                }
            }

            //System.out.println("first: " + first);
            sec = arr[0];
            for (int val : arr) {
                if (val > sec && val < first) {
                    sec = val;
                }
                if (sec == first && val < sec) {
                    sec = val;
                }
            }

            //System.out.println("sec: " + sec);
            third = arr[0];
            for (int val : arr) {
                if (val > third && val < sec) {
                    third = val;
                }
                if (third == sec && val < third) {
                    third = val;
                }
                if (third == first && val < third) {
                    third = val;
                }
            }
            //System.out.println("third: " + third);
            if (first > sec && sec > third) System.out.println(third);
            else System.out.println("The array doesn't have a third maximum element");
        }
    }
}
