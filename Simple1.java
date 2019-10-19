package com.company;

import java.util.Scanner;
class Rectangle{
    void perimeter(double x,double y){
        System.out.println("perimeter of rectangle is :"+(2*(x+y)));
    }
}
class Check extends Rectangle{
    void perimeter(double x,double y){
        if (x==y){
            System.out.println("Rectangle is square "+"\n"+"Perimeter of Rectangle is :"+(4*x));
        }else {
            System.out.println("rectangle is not square");
            super.perimeter(x,y);
        }
    }
}
class simple{
    public static void main(String[] args) {
        System.out.println("welcome to implementation of package with ploymorphism...\n");
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number for calculate the perimeter :");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        Check obj = new Check();
        obj.perimeter(num1,num2);
    }
}
interface Shape{
    void parameter();
}
public class Simple1 {
    void perimeter(double x,double y){
        if(x==y){
            System.out.println("if shape of given figure is square" +"\n"+"perimeter of square is :"+(4*x));
        }else {
            System.out.println("shape is rectangle"+"\n"+"perimeter of Rectangle is "+(2*(x+y)));
        }
    }

    public static void main(String[] args) {
        System.out.println("welcome to implementation of package with interface \n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for calculate the perimeter :");
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        Simple1 obj1 = new Simple1();
        obj1.perimeter(num3,num4);
    }
}
