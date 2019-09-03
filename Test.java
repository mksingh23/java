package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenght of Box :");
        int l = sc.nextInt();
        System.out.print("enter the breadth of Box :");
        int b = sc.nextInt();
        System.out.print("enter the height of Box :");
        int h = sc .nextInt();
        System.out.print("enter the side of an cube :");
        int side=sc.nextInt();
        Box b1=new Box(l,b,h);
        Box b2=new Box();
        Box b3=new Box(side);
        System.out.println("volume of Box b1 is :" +b1.volume());
        System.out.println("volume of Box b2 is :" +b2.volume());
        System.out.println("volume of Box b3 is :" +b3.volume());
    }
}
class  Box{
    double length,breadth,height;
    Box(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    Box(){
        this.length=0;
        this.breadth=0;
        this.height=0;
    }
    Box(double side){
        this.length=side;
        this.breadth=side;
        this.height=side;
    }
    double volume(){
        return length*breadth*height;
    }
}
