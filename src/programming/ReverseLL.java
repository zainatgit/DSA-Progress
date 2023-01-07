package programming;

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.print();
        reverse(ll);
        ll.print();

    }
    static void reverse(LinkedList ll){
        //reverse
        Node cur=ll.getHead();
        Node prev = null;
        Node next = null;
        while(cur!=null){
            next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur=next;
        }
        ll.setHead(prev);
    }
}
class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(String el){
        if(head == null){
            Node newNode = new Node(el);
            this.head = newNode;
        }else {
            Node temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            Node newNode = new Node(el);
            temp.setNext(newNode);
        }
    }

    public void print(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.getEl());
            temp = temp.getNext();
        }
        System.out.println();
    }
}

class Node {
    private String el;
    private Node next;

    public Node(String el) {
        this.el = el;
    }

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
        this.el = el;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}