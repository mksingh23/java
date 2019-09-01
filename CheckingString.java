package com.company;

import java.util.Scanner;

public class CheckingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(euals(s1,s2));
        //CheckingString cs = new CheckingString();
        //cs.greater(s1,s2);
        cancatenate(s1,s2);
    }
    public static boolean euals(String s1, String s2){
       if (s1.equals(s2)){
           return true;
       }
       return false;
    }
    public static  void greater(String s1, String s2){
        if (s1.length()>s2.length()){
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i)==s1.charAt(i)){
                    continue;
                }
                System.out.println(s1.charAt(i));
            }

        }else {
            for (int i = 0; i <s1.length() ; i++) {
                if (s1.charAt(i)==s2.charAt(i)){
                    continue;
                }
                System.out.println(s2.charAt(i));
            }

        }
    }
    public static void cancatenate(String s1,String s2){
        System.out.println(s1.concat("" +s2));
    }
}
