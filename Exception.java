package com.company;

public class Exception extends Throwable{
    public static void main(String[] args) throws Exception {
        int a=5;
        int b=0;
        int []arr =new int[5];
        String s= "abc";
        String name=null;
       try {

           //int c=a/b;
           arr[6]=4;
           int n=Integer.parseInt(s);
           int len=name.length();
       }
       catch (ArithmeticException e){
           System.out.println("Any number cannot be devided by zero"+e);
           System.out.println(a/b+2);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("data cannot be store array out of index :"+e);
       }
       catch (NumberFormatException e){
           System.out.println("string cannot be typecast in integer"+e);
       }
       catch (NullPointerException e){
           System.out.println(e);
       }
    }
}
