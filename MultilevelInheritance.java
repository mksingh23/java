package com.company;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Three th = new Three();
        th.First();
        th.second();
        th.third();
    }
}
class One{
    public void First(){
        System.out.println("first class");
    }
}
class Two extends One{
    public void second(){
        System.out.println("Second class inherited the first class");
    }
}
class Three extends Two{
    public void third(){
        System.out.println("class third inherited the first and second class");
    }
}

