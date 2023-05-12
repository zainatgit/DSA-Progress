package programming.stack;
/*
1) push() which adds an element to the top of stack.
2) pop() which removes an element from top of stack.
3) findMiddle() which will return middle element of the stack.
4) deleteMiddle() which will delete the middle element.
Push and pop are standard stack operations.
 */
public class ImplementStackWithMiddleOperations {
    public static void main(String[] args) {
        StackWithMiddle stack = new StackWithMiddle();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printList();
        stack.printMiddle();

        stack.pop();
        stack.printList();
        stack.printMiddle();
        stack.deleteMiddle();
        stack.printMiddle();
        stack.printList();
        stack.pop();
        stack.printList();
        stack.printMiddle();
        stack.deleteMiddle();
        stack.printList();

    }
}

class StackWithMiddle {
    DoublyNode start;
    DoublyNode middle;
    DoublyNode end;
    int size;

    void push(int data){
        size++;
        if(start == null){
            DoublyNode newNode = new DoublyNode();
            newNode.val = data;
            start = newNode;
            middle = start;
            end = start;
        } else {
            DoublyNode newNode = new DoublyNode();
            newNode.val = data;
            end.next = newNode;
            newNode.prev = end;
            end = end.next;
            if(size % 2 == 0){
                middle = middle.next;
            }
        }
    }

    int pop(){
        int poppedVal = 0;
        System.out.println("Popping..");
        if(end == null){
            System.out.println("Stack is empty !!");
            return -1;
        }else{
            poppedVal = end.val;
            end = end.prev;
            end.next = null;
            if(size == 1){
                start = null;
                middle = null;
            }
            else if(size % 2 == 0){
                middle = middle.prev;
            }
        }
        size--;
        return poppedVal;
    }

    void printList(){
        DoublyNode curr = this.start;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printMiddle(){
        if(middle != null){
            System.out.println("Middle : " + middle.val);
        }else{
            System.out.println("Stack is empty !!");
        }
    }

    void deleteMiddle(){
        System.out.println("Deleting middle..");
        if(size == 1) {
            start = null;
            middle = null;
            end = null;
        }else if(size % 2 == 0){
            DoublyNode temp = middle.prev;
            temp.next = middle.next;
            middle = temp;
        }else{
            DoublyNode temp = middle.prev;
            temp.next = middle.next;
            middle = temp.next;
        }
        size--;
    }




}

class DoublyNode{
    DoublyNode prev;
    DoublyNode next;
    int val;

}
