package com.company;

import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the String for check weather it is pallindrome or not :");
        String name = s.nextLine();
        System.out.println(stringPallindrome(name));
    }
    public static boolean stringPallindrome(String name){
        String reverse="";
        for (int i = name.length()-1; i >= 0; i--) {
             reverse = reverse + name.charAt(i);
        }
        if (name.equals(reverse)){
            return true;
        }
        return false;
    }
}
