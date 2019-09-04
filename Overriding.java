package com.company;

public class Overriding {
    public static void main(String[] args) {
        Employee emp = new Manager();
        System.out.println("the salary of a manager is :");
        printSalary(emp);
        Employee emp1 = new Clerk();
        System.out.println("the salary of a Clerk is :");
        printSalary(emp1);
        Employee e1 = new Employee();
        System.out.println("the salary of a Employee is :");
        printSalary(e1);
    }
    public static void printSalary(Employee em){
        System.out.println(em.salary());
    }
}
class Employee{
    public static int base=10000;
    int salary(){
        return base;
    }
}
class Manager extends Employee{
    int salay(){
        return base+30000;
    }
}
class Clerk extends Employee{
    int salary(){
        return base+30000;
    }
}
