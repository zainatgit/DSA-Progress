package programming.stack;

public class ImplementTwoStackUsingAnArray {
    public static void main(String[] args) {
        TwoStack newStack = new TwoStack(10);
        newStack.add1(46);
        newStack.add1(68);
        newStack.add1(98);
        newStack.add1(12);
        newStack.print1();

        newStack.add2(53);
        newStack.add2(67);
        newStack.add2(81);
        newStack.add2(9);
        newStack.print2();

        newStack.remove1();
        newStack.remove1();
        newStack.remove1();
        newStack.remove1();
        newStack.remove1();
        newStack.print1();

        newStack.add2(43);
        newStack.add2(99);
        newStack.add2(77);
        newStack.add2(3);
        newStack.print2();


        newStack.add1(46);
        newStack.add1(68);
        newStack.add1(42);
        newStack.print1();
        newStack.print2();
    }
}

class TwoStack {
    int[] stack;
    int top1;
    int top2;

    TwoStack(int size){
        stack = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void add1(int n){
        if(top1 < stack.length && top1+1 < top2){
            top1++;
            stack[top1] = n;
        }else{
            System.out.println("Stack is full !!");
        }
    }

    public void add2(int n){
        if(top2 >= 0 && top2 > top1){
            top2--;
            stack[top2] = n;
        }else{
            System.out.println("Stack is full !!");
        }
    }

    public void remove1(){
        if(top1 > -1){
            stack[top1] = -99;
            top1--;
        }else{
            System.out.println("Stack is empty !!");
        }
    }

    public void remove2(){
        if(top2 < stack.length){
            stack[top2] = -99;
            top2++;
        }else{
            System.out.println("Stack is empty !!");
        }
    }

    public void print1(){
        if(top1 > -1){
            for (int i=0; i<=top1; i++){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("Stack is empty !!");
        }
    }

    public void print2(){
        if(top2 < stack.length){
            for (int i=stack.length-1; i>=top2; i--){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("Stack is empty !!");
        }
    }

}
