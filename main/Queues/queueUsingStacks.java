package Queues;

import java.util.Stack;

public class queueUsingStacks {
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    static void enqueue(int x) {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    static int dequeue() {
        if (st1.isEmpty()) return -1;

        else {
            int x = st1.peek();
            st1.pop();
            return x;
        }
    }


    public static void main(String[] args)
    {
        queueUsingStacks q = new queueUsingStacks();
        queueUsingStacks.enqueue(1);
        queueUsingStacks.enqueue(2);
        queueUsingStacks.enqueue(3);

        System.out.println(queueUsingStacks.dequeue());
        System.out.println(queueUsingStacks.dequeue());
        System.out.println(queueUsingStacks.dequeue());
    }
}
