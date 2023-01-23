package programming.linkedlist;

public class ReverseLL {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
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
    static void reverse(MyLinkedList ll){
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
