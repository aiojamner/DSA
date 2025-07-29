package sorts;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class InsertionSortList {

    public static ListNode insertionSortList(ListNode head){
        List<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while (temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        Collections.sort(list);
        for (int i=0;i<list.size();i++){
            temp.val = list.get(i);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(ListNode listNode){
        while (listNode!=null){
            System.out.print(listNode.val+" -> ");
            listNode = listNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3, new ListNode(10, new ListNode(17,new ListNode(12,new ListNode(8)))));

        long time1 = System.currentTimeMillis();

        System.out.println("*********** Insertion Sort List ************");
        System.out.println("List Without Sort");
        printList(l1);

        insertionSortList(l1);

        System.out.println("List With Sort");
        printList(l1);

        System.out.println("Time Complexity : "+(System.currentTimeMillis() - time1));
    }
}
