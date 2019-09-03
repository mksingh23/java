package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the month :");
        int month = sc.nextInt();
        switch (month){
            case 1 :
                System.out.println("Winter Season");
                break;
            case 2:
                System.out.println("Winter Season");
                break;
            case 3:
                System.out.println("Spring Season");
                break;
            case 4:
                System.out.println("Spring Season");
                break;
            case 5:
                System.out.println("Spring Season");
                break;
            case 6:
                System.out.println("Summer Season");
                break;
            case 7:
                System.out.println("Summer Season");
                break;
            case 8:
                System.out.println("Summer Season");
                break;
            case 9:
                System.out.println("Autumn Season");
                break;
            case 10:
                System.out.println("Autumn Season");
                break;
            case 11:
                System.out.println("Autumn Season");
                break;
            case 12:
                System.out.println("Winter Season");
                break;
        }
    }
}
