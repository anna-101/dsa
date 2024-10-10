package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackUsingSingleQueue {
    static Queue<Integer> q = new LinkedList<>();

    public static void push(int x){
        int s = q.size();
        q.add(x);
        for(int i=0;i<s;i++){
            int a = q.remove();
            q.add(a);
        }
    }

    static int pop()
    {
        if (q.isEmpty())
        {
            System.out.println("No elements");
            return -1;
        }
        int x = q.remove();
        return x;
    }

    static int top(){
        if(q.isEmpty()) {
            System.out.println("No Elements");
            return -1;
        }
        return q.peek();
    }

    public static void main(String[] args){
        stackUsingSingleQueue st = new stackUsingSingleQueue();
        st.push(99);
        st.push(31);
        st.push(11);
        System.out.println("Remove 1st element " + st.pop());
        System.out.println("Top Element " + st.top());
    }
}
