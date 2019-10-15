package com.company;

import java.util.Scanner;

abstract public class Calculator {
    double a;
    double b;
    double result;
    public abstract void evaluate();
    public abstract void display();
    public static void main(String[] args) {
        System.out.println("implementation of interface");
        System.out.println("Enter two digit for calculation :");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println("Welcome to Calculator :-");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. divide");
        System.out.println("Enter your choice ...");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                Addition ad = new Addition(first,second);
                ad.evaluate();
                ad.display();
                break;
            case 2:
                Subtraction sb = new Subtraction(first,second);
                sb.evaluate();
                sb.display();
                break;
            case 3:
                Multiplication ml = new Multiplication(first,second);
                ml.evaluate();
                ml.display();
                break;
            case 4 :
                Devide dv = new Devide(first,second);
                dv.evaluate();
                dv.display();
                break;
        }
    }
}
class Addition extends Calculator{
    public Addition(double x,double y){
        this.a=x;
        this.b=y;
    }

    @Override
    public void evaluate() {
    result=a+b;
    }

    @Override
    public void display() {
        System.out.println("the result of the expression is :"+a+"+"+b+"="+result);
    }
}
class Subtraction extends Calculator{
    public Subtraction(double x,double y){
        this.a=x;
        this.b=y;
    }
    @Override
    public void evaluate() {
        result=a-b;
    }

    @Override
    public void display() {
        System.out.println("the result of the expression is :"+a+"-"+b+"="+result);
    }
}
class Multiplication extends Calculator{
    public Multiplication(double x,double y){
        this.a=x;
        this.b=y;
    }

    @Override
    public void evaluate() {
        result=a*b;
    }

    @Override
    public void display() {
        System.out.println("the result of this expression is :"+a+"*"+b+"="+result);
    }
}
class Devide extends Calculator{
    public Devide(double x,double y){
        this.a=x;
        this.b=y;
    }

    @Override
    public void evaluate() {
        result=a/b;
    }

    @Override
    public void display() {
        System.out.println("the result of this expression is :"+a+"/"+b+"="+result);
    }


}

