package com.company;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int []nums={4,2,5,8,7,9,3};
        int n=nums.length;
        BubbleSort bs=new BubbleSort();
        System.out.println("array before sorting");
        bs.display(nums);
        bs.bubbleSort(nums);
        System.out.println("arrays after sorting");
        bs.display(nums);
    }
    public static void bubbleSort(int[]nums){
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void display(int[]nums){
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");

        }
        System.out.println();
    }
}
