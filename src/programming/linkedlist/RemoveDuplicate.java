package programming.linkedlist;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add("12");
        ll.add("11");
        ll.add("12");
        ll.add("21");
        ll.add("41");
        ll.add("43");
        ll.add("21");

        removeDuplicate(ll);
    }

    private static void removeDuplicate(MyLinkedList ll) {
        Node head = ll.getHead();
        Node temp = head;
        Node prev = null;
        ArrayList<String> ogList = new ArrayList();
        while (temp != null) {
            String el = temp.getEl();
            if (!ogList.contains(el)) {
                ogList.add(el);
                prev = temp;
                temp = temp.getNext();
            }else{
                temp = temp.getNext();
                prev.setNext(temp);
            }
        }
        ll.print();
    }
}
