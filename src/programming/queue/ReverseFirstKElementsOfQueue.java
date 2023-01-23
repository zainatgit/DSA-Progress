package programming.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
Input:
5 3
1 2 3 4 5

Output:
3 2 1 4 5
 */
public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(5);
        q1.add(4);
        q1.add(3);
        q1.add(2);
        q1.add(1);

        int k = 3;
        int len = q1.size();
        int c = q1.size()-1;
        Queue<Integer> q2 = new LinkedList<>();
        while(c > len-k){
            q2.add(q1.remove());
            c--;
        }
        Stack<Integer> stack = new Stack<>();
        while(!q1.isEmpty()){
            stack.add(q1.remove());
        }
        while(!stack.isEmpty()){
            q2.add(stack.pop());
        }
        for(int i : q2){
            System.out.print(i + " ");
        }

    }
}
