package com.company;

 class Bycycle {
    public int gear;
    public int speed;
    public Bycycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBreak(int decrement){
        speed=speed-decrement;
    }
    public void speedUp(int increment){
        speed=speed+increment;
    }
    public String toString(){
        return ("No of gears are :" +gear+ "\n"+"speed of bycycle is :" +speed);
    }
}
class MoutainBike extends Bycycle{
    public int seatHeight;
    public MoutainBike(int gear, int speed,int seatHeight) {
        super(gear, speed);
        this.seatHeight=seatHeight;
    }
    public void setHeight(int newValue){
        seatHeight=newValue;
    }
    public String toString(){
        return (super.toString()+"\n seatHeight is :"+seatHeight);
    }
}
public class TestBycycle{
    public static void main(String[] args) {
        MoutainBike b1= new MoutainBike(4,50,30);
        System.out.println(b1.toString());
        b1.speedUp(40);
        System.out.println(b1.toString());
    }
}

