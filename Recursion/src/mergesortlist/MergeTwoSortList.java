package mergesortlist;

public class MergeTwoSortList {

    public ListNode mergeTwoSort1(ListNode l1, ListNode l2){

        System.out.println("*********** Approach One ************");
        ListNode temp = new ListNode();
        ListNode cur = temp;

        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                cur.next = l2;
                l2 = l2.next;
            }else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }

        cur.next = (l1 !=null) ? l1 : l2;

        return temp.next;
    }

    public ListNode mergeTwoSort2(ListNode l1, ListNode l2){



        if (l1 == null || l2 == null){
            return (l1 != null) ? l1 : l2;
        }

        if (l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        l1.next = mergeTwoSort2(l1.next,l2);

        return l1;
    }


    public static void main(String[] args) {
//        int[] arr1 = {3,5,6,10,17};
//        int[] arr2 = {8,12,16,19};

        ListNode l1 = new ListNode(3, new ListNode(10, new ListNode(17)));

        // Creating second sorted list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(8, new ListNode(16, new ListNode(19)));

        System.out.println("First List");
        printList(l1);
        System.out.println("Second List");
        printList(l2);
        MergeTwoSortList mergeList = new MergeTwoSortList();
        ListNode list1 = mergeList.mergeTwoSort1(l1,l2);



        System.out.println("Sorted List");
        printList(list1);

        l1 = new ListNode(3, new ListNode(10, new ListNode(17)));
        l2 = new ListNode(8, new ListNode(16, new ListNode(19)));

        System.out.println("*********** Approach Two ************");
        ListNode list2 = mergeList.mergeTwoSort2(l1,l2);
        System.out.println("Sorted List");
        printList(list2);

    }

    public static void printList(ListNode listNode){
        while (listNode!=null){
            System.out.print(listNode.val+" -> ");
            listNode = listNode.next;
        }
        System.out.println("null");
    }
}
