package com.company;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an stack :");
        int n = sc.nextInt();
        int stack1[] = new int[n];
        System.out.println("enter the item for inserting :");
        int top=-1;
        push(stack1,top);
        display(stack1);
    }
    public static void push(int [] stack,  int top  ){
        int n=stack.length;
        Scanner s=new Scanner(System.in);
        int item=s.nextInt();
        if ( top == n) {
            System.out.println("overflow");
        }else {
            stack[++top] = item;
            push(stack,top);
        }
    }
    public static void display(int [] stack){
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i]);
        }
    }
}
