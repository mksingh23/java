package com.company;

class Sender extends Exception{
    public void send(String msg){
        System.out.println("Sending \t"+msg);
        try {
                Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Thread is interrupted");
        }
        System.out.println("\n" +msg+ "Sent");
    }
}
class ThreadSend extends Thread{
    private String msg;
    Sender sender;
    ThreadSend(String m,Sender obj){
        msg=m;
        sender=obj;
    }
    public void run(){
        synchronized (sender){
            sender.send(msg);
        }
    }
}
public class SynchronizationDemo  {
    public static void main(String[] args) {
        Sender snd=new Sender();
        ThreadSend s1= new ThreadSend("hi",snd);
        ThreadSend s2 = new ThreadSend("bye",snd);
        s1.start();
        s2.start();
        try {
           s1.join();
           s2.join();
        }catch (InterruptedException e){
            System.out.println("Interupted");
        }
    }
}
