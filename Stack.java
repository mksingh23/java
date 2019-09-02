package com.company;

import java.util.Scanner;

public class Stack {
    static int top=-1,stack[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an stack :");
        int n = sc.nextInt();
        stack = new int[n];
        System.out.println("enter the item for inserting :");
        push(stack);
        display(stack);
        pop();
        display(stack);
    }
    public static void push(int [] stack){

        int n = stack.length;
        Scanner s=new Scanner(System.in);
        int item=s.nextInt();

        if ( top == n-1) {
            System.out.println("overflow");
        }else {
            stack[++top] = item;
            push(stack);
        }
    }
    public static void display(int [] stack){
        for (int i = 0; i < top; i++) {
            System.out.println(stack[i]);
        }
    }
    public static void pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        else {
            System.out.println(stack[top]+ "is poped\n");
            top=top-1;
            pop();
        }
    }
}
