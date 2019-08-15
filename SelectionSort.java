package com.company;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n = s.nextInt();
        int [] nums =new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=s.nextInt();
        }
        SelectionSort ss = new SelectionSort();
        System.out.println("the array before sorted :");
        ss.display(nums,n);
        System.out.println("array after the sorted :");
        ss.selectionSort(nums, n);
        ss.display(nums,n);
    }
    public static void selectionSort(int [] arr , int n){
        int min_index;
        for (int i = 0; i < n-1; i++) {
            min_index = i ;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index=j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public void display(int [] nums , int n){
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+ " " );
        }
        System.out.println();
    }
}
