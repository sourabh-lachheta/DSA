package com.LinkedList.problems;

import com.LinkedList.main.LL;

public class mergeLinkedLIst_21 {

    public static void display(LL.ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }



    public static LL.ListNode mergeTwoLists(LL.ListNode list1, LL.ListNode list2) {

        LL.ListNode temp = new LL.ListNode();
        LL.ListNode ans = temp;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ans.next = list1;
                list1 = list1.next;
                ans = ans.next;
            }
            else{
                ans.next = list2;
                list2 = list2.next;
                ans = ans.next;
            }
        }

        while(list1 != null){
            ans.next = list1;
            list1 = list1.next;
            ans = ans.next;
        }

        while(list2 != null){
            ans.next = list2;
            list2 = list2.next;
            ans = ans.next;
        }


        return temp.next;
    }

    public static void main(String[] args){

        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(4);

        list2.insertAtLast(1);
        list2.insertAtLast(5);
        list2.insertAtLast(6);

        LL.ListNode ans = mergeTwoLists(list1.getHead(),list2.getHead());
        display(ans);


    }
}
