package programming.linkedlist;

import java.util.Objects;

public class AlternateRearrangeLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        ll.add("5");

        MyLinkedList ll2 = new MyLinkedList();
        ll2.add("5");
        ll2.add("4");
        ll2.add("3");
        ll2.add("2");
        ll2.add("1");

        Node head = ll.getHead();
        Node Rhead = ll2.getHead();

        MyLinkedList newList = alternateRearrange(head,Rhead);
        System.out.println();
    }

    static MyLinkedList alternateRearrange(Node head, Node Rhead){
        MyLinkedList newList = new MyLinkedList();

        Node newNode = new Node("0");
        Node fastNode = head;
        while(head !=null && Rhead!=null && fastNode.getNext()!=null && fastNode.getNext().getNext()!=null){
            newNode.setNext(head);
            newNode = newNode.getNext();
            newNode.setNext(Rhead);
            newNode = newNode.getNext();

            head = head.getNext();
            Rhead = Rhead.getNext();

            fastNode = fastNode.getNext().getNext();
        }
        newNode.setNext(head);
        newNode = newNode.getNext();
        newNode.setNext(Rhead);
        newList.setHead(newNode.getNext());
        return newList;
    }

    static Node reverse(Node head){
        //reverse
        Node cur=head;
        Node prev = null;
        Node next = null;
        while(cur!=null){
            next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur=next;
        }
        return prev;
    }
}
