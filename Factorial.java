package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter the number which you want to find a factorial :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        fact(num);
    }
    public static void fact(int num){
        int fact=1;
        for (int i = num; i > 0 ; i--) {
            fact = fact * i;
        }
        System.out.println("factorial of a "+ num + " is : " +fact );
    }
}
