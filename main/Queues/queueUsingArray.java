package Queues;

import java.util.Queue;

public class queueUsingArray {
    static int rear;
    static int front;
    static int capacity;
    static int[] queue;

    queueUsingArray(int c){
        rear = -1;
        front=0;
        capacity = c;
        queue = new int[capacity];
    }

    public static void insert(int data){
        if(rear == capacity - 1){
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = data;
    }

    public static void deleteFromQueue(){
        if(rear == -1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front;i<rear;i++){
            queue[i] = queue[i+1];
        }
        rear--;
    }

    public static void printQueue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front;i<=rear ; i++){
            System.out.println(queue[i] + " ");
        }
    }

    public static void getFront(){
        if(rear == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is"+ queue[front]);

    }

    public static void main(String[] args){
        queueUsingArray q = new queueUsingArray(5);


        q.insert(4);
        q.insert(20);
        q.insert(30);
        q.insert(50);

        System.out.println("Queue at the beginning");
        printQueue();

        deleteFromQueue();

        System.out.println("After dequeue operation");
        printQueue();

        insert(10);
        insert(88);

        System.out.println("After enqueue operation");
        printQueue();
    }
}
