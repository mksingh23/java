package com.company;

public class SuperTest {
    public static void main(String[] args) {
        LuxuryCar lc = new LuxuryCar();
        lc.show();
    }
}
class Vehicle{
    int maxSpeed=140;
    public void show(){
        System.out.println(maxSpeed);
    }
}
class Car extends Vehicle{
   int maxSpeed=180;
   void display(){
       System.out.println("Maximum Speed of Vehicle is :"+super.maxSpeed);
       System.out.println("Maximum Speed of car is :" +maxSpeed);
   }
}
class LuxuryCar extends Car{
    int maxSpeed=240;
    public void show(){
        System.out.println("The Maximum Speed of Vehicle is :"+super.maxSpeed);
        System.out.println("The Maximum Speed of LuxuryCar is :" +maxSpeed);
    }
}
