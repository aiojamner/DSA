import java.util.Scanner;

public class DeleteByValue {
    
    private static class LinkNode{
        int val;
        LinkNode next;
        
        public LinkNode(){}
        
        public LinkNode(int val){
            this.val = val;
        }
        
        public LinkNode(int val, LinkNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static void printList(LinkNode head){
        while (head!=null){
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static LinkNode deleteByValue(int val, LinkNode head){
        int flag = 0;
        if (head==null)return head;
        if (head.val == val){
            head = head.next;
            return head;
        }

        LinkNode cur = head;


        while (cur.next!=null && cur.next.val != val){
            cur =cur.next;
        }
        if (cur.next != null){
            flag =1;
            cur.next = cur.next.next;
        }

        if(flag == 0){
            System.out.println(val+" Value not found ............");
            return head;
        }
        return cur;
    }

    public static void main(String[] args) {
        LinkNode linkNode = new LinkNode(8, new LinkNode(12, new LinkNode(15, new LinkNode(19))));

        System.out.println("**************** Delete by Value in LinkedList *******************");
        System.out.println("Original LinkedList : ");

        printList(linkNode);

        Scanner sc = new Scanner(System.in);

        int ch = 0;
        do {

            System.out.print("\n Which value you want to Delete : ");
            int val = sc.nextInt();

             linkNode = deleteByValue(val, linkNode);

            System.out.println("After Deleting " + val + " value LinkedList :");
            printList(linkNode);

            System.out.println("Do you want to delete again press 1 if not then press 0");
            ch = sc.nextInt();
        }while (ch != 0);
    }
}
