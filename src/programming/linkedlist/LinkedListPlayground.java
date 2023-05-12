package programming.linkedlist;

public class LinkedListPlayground {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add("12");
        ll.add("15");
        ll.add("10");
        ll.add("11");
        ll.add("5");
        ll.add("6");
        ll.add("2");
        ll.add("3");
        ll.print();
        Node temp = ll.getHead();

        ll.setHead(null);
        System.out.println(temp); // Even if we had set temp = head, and we make head as null, temp does not become null
    }
}
