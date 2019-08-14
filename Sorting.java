package com.company;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Sorting ob =new Sorting();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n=sc.nextInt();
        int []nums=new int[n];
        System.out.println("enter the number of an array");
        for (int i = 0; i <=n ; i++) {
            nums[i]=sc.nextInt();
        }
        ob.bubbleSort(nums,n);
        ob.display(nums);
    }
    public static void bubbleSort(int []nums, int n){
        int temp;
        for (int i = 0; i <=nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
    public static void display(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            System.out.println("the element of an array" + nums[i]);
        }
    }
}
