package programming.linkedlist;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head1 = new ListNode();
        head1.val = -9;
        head1.next = new ListNode();
        head1.next.val = 3;
        ListNode head2 = new ListNode();
        head2.val = 5;
        head2.next = new ListNode();
        head2.next.val = 7;
        ListNode result = noExtraSpace(head1,head2);
        while (result !=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode noExtraSpace(ListNode list1,ListNode list2){
        ListNode temp  = null;
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode res = null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val <= list2.val){
            l1 = list1;
            l2 = list2;
        }else{
            l1 = list2;
            l2 = list1;
        }
        res = l1;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                temp = l1;
                l1=l2;
                l2=temp;
            }
        }
        temp.next = l2;
        while(l2!=null){
            l2=l2.next;
        }
        return res;
    }
    public static ListNode bruteForce(ListNode list1,ListNode list2){
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


