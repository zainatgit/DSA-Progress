package programming.linkedlist;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head1 = new ListNode();
        ListNode head2 = new ListNode();
        ListNode result = mergeTwoList(null,head2);
        while (result !=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeTwoList(ListNode list1,ListNode list2){
        ListNode head3;
        ListNode temp;
        if(list1!=null || list2!=null){
            head3 = new ListNode();
            temp = head3;
        }else{
            return null;
        }
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                temp.val = list1.val;
                list1 = list1.next;
            }else {
                temp.val = list2.val;
                list2 = list2.next;
            }
            temp.next = new ListNode();
            temp = temp.next;
        }
        while(list1!=null){
            temp.val = list1.val;
            list1 = list1.next;
            if(list1!=null){
                temp.next = new ListNode();
            }
            temp = temp.next;
        }
        while(list2!=null){
            temp.val = list2.val;
            list2 = list2.next;
            if(list2!=null){
                temp.next = new ListNode();
            }
            temp = temp.next;
        }
        return head3;
    }

}



class ListNode {
     public int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
