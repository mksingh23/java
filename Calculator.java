package com.company;

abstract public class Calculator {
    double a;
    double b;
    double result;
    public abstract void evaluate();
    public abstract void display();
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

