package com.LinkedList.problems;

public class IsPalindrome_234 {

    public boolean isPalindrome(ListNode head) {

        ListNode mid = middle(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond;

        while(head != null && headSecond != null){

            if(head.val != headSecond.val){
                break;
            }

            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(headSecond);

        return head == null || headSecond == null;

    }

    public ListNode middle(ListNode head){
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    public ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }


    public class ListNode{

        int val;
   ListNode next;

      public ListNode() {

      }
      public ListNode(int val) {
          this.val = val;
      }
      public ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }

    }
}
