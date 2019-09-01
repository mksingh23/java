package com.company;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = s.nextInt();
        int [] nums = new int[n];
        System.out.println("enter the element of an array :");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
    }
    public void display(int [] nums, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
            System.out.println();
        }
    }
    public static void insertionSort(int [] nums, int n){
        for (int i = 1; i < n-1; i++) {
            int key = nums[i];
            for (int j = i; j > 0; j--) {
                if (nums[j]>nums[j+1]){

                }
            }
        }
    }
}
