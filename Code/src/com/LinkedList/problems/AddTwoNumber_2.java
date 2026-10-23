package com.LinkedList.problems;

public class AddTwoNumber_2 {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int extra = 0;
        int ans = 0;

        ListNode result = new ListNode(0);
        ListNode dummy = result;

        while(l1 != null && l2 != null ){
            ans = l1.val + l2.val + extra;
            extra = 0;
            if(ans > 9){
                extra = 1;
                ans = ans - 10;
            }

            result.next = new ListNode(ans);
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            ans = l1.val + extra;
            extra = 0;
            if(ans > 9){
                extra = 1;
                ans = ans - 10;
            }

            result.next = new ListNode(ans);
            result = result.next;
            l1 = l1.next;
        }

        while(l2 != null){
            ans = l2.val + extra;
            extra = 0;
            if(ans > 9){
                extra = 1;
                ans = ans - 10;
            }

            result.next = new ListNode(ans);
            result = result.next;
            l2 = l2.next;
        }

        if(extra == 1){
            result.next = new ListNode(extra);
            return dummy.next;
        }

        return dummy.next;

    }

}
