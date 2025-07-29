package sorts;

import java.util.ArrayList;
import java.util.List;

public class MergeSortList {

    public static ListNode mergeSort(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null;




        ListNode Left = mergeSort(head);
        ListNode Right = mergeSort(rightHead);


        

        return merge(Left,Right);

    }

    private static ListNode getMiddle(ListNode head){
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        System.out.println("********** Merge Sort **************");
        ListNode l1 = new ListNode(10, new ListNode(8,new ListNode(13, new ListNode(7, new ListNode(3, new ListNode(16))))));
        ListNode l2 = new ListNode(11, new ListNode(7,new ListNode(14, new ListNode(6, new ListNode(4, new ListNode(15))))));

        System.out.println("Original First List :");
        printList(l1);
        System.out.println("Original Second List :");
        printList(l2);

        ListNode list1 = mergeSort(l1);
        ListNode list2 = mergeSort(l2);


        ListNode finalList = merge(list1,list2);

        System.out.println("After Merge Final List :");
        printList(finalList);

    }

    private static ListNode merge(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null){
            if (l1.val<=l2.val){
                current.next = l1;
                l1 = l1.next;
            }else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null){
            current.next = l1;
        }
        if(l2 != null){
            current.next = l2;
        }

        return dummy.next;
    }

    public static void printList(ListNode node){
        while (node.next != null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.print("null\n");
    }


}
