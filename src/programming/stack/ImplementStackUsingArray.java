package programming.stack;

public class ImplementStackUsingArray {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);
        myStack.add(20);
        myStack.add(25);
        System.out.println(myStack.getSize());
        myStack.printAll();
        myStack.remove();
        myStack.printAll();
        myStack.remove();
        myStack.remove();
    }
}


class Stack {
    private int[] stack;
    private int top;

    Stack(int size){
        stack = new int[size];
        top = -1;
    }

    public void add(int n){
        if(top < n){
            top++;
            stack[top] = n;
        }else{
            System.out.println("Can't add more elements. Stack is full");
        }
    }

    public void remove(){
        if(top > -1){
            stack[top] = -99;
            top--;
        }else{
            System.out.println("Can't remove element. Stack is empty");
        }
    }

    public void printAll(){
        for(int i =0; i<=top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public int getSize(){
        return top+1;
    }
}
