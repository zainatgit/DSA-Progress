package programming.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingTwoQueues {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.top();
        myStack.pop();
        myStack.empty();
    }
}

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }


    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        while(q1.size() > 1){
            q2.add(q1.poll());
        }
        int n = q1.poll();
        while(q2.size() > 0){
            q1.add(q2.poll());
        }
        return n;
    }

    public int top() {
        int n = pop();
        push(n);
        return n;
    }

    public boolean empty() {
        System.out.println("Size: "+q1.size());
        return q1.size()==0;
    }


}
