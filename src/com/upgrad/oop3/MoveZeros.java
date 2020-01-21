package com.upgrad.oop3;

public class MoveZeros {
    public static void main(String[] args){

        int[] ar = {5,8,0,15,6,0,1,0,13};
        int[] ar1 = {3,0,0,0,0,0,0,0,1};
        moveZeros(ar1);
        for(int val:ar1){
            System.out.println(val);
        }
    }

    public static void moveZeros(int[] nums) {
        int n = nums.length;
        int i = 0;
        int prev=0;
        boolean flag = false;
        while (i < n) {
            if (nums[i] != 0 && !flag) {
                i++;
            }
            else if(nums[i] != 0 && flag){
                nums[prev] = nums[i];
                nums[i] = 0;
                i = prev;
                flag = false;
            }
            else if(nums[i] == 0){
                if(!flag){
                    prev = i;
                    flag = true;
                }
                i++;
            }
        }
    }
}
