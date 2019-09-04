package com.company;

public class Queue {
    public static void main(String[] args) {
        QueueOperation q = new QueueOperation(6);
        q.insertion(15);
        q.insertion(20);
        q.insertion(14);
        q.insertion(16);
        q.insertion(17);
        System.out.println("\n after insertion of element in a Queue ");
        q.queueDisplay();
        q.deletion();
        q.deletion();
        q.deletion();
        System.out.println("\n after the deletion of two node from Queue ");
        q.queueDisplay();
        q.front();
    }
}
class QueueOperation{
    private static int front,rear,size;
    private static int queue[];
    QueueOperation(int s){
        front=0;
        rear=0;
        size=s;
        queue = new int[size];
    }
    static void insertion(int data){
        if(rear == size){
            System.out.println("\n Queue is Full \n");
            return;
        }else {
            queue[rear]=data;
            rear++;
        }
        return;
    }
    static void deletion(){
        if (front == rear){
            System.out.println("\n Queue is Empty \n");
            return;
        }else {
            for (int i = 0; i <rear-1 ; i++) {
                queue[i]=queue[i+1];
            }
            if (rear < size) {
                queue[rear]=0;
            }
            rear--;
        }
        return;
    }
    public static void queueDisplay(){
        if (front == rear) {
            System.out.println("\n Queue is Empty \n");
        }

        for (int i = front; i < rear; i++) {
            System.out.print("<--" +queue[i]);
        }
        return;
    }
    static void front(){
        if (front == rear){
            System.out.println("Queue is Empty");
            return;
        }else {
            System.out.println("\n front element of Queue is :" +queue[front]);
            return;
        }
    }
}
