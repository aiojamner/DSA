import java.util.Scanner;

public class InsertAtFirst {

    public static class LinkNode{
        int val;

        LinkNode next;

        public LinkNode(){

        }

        public LinkNode(int val){
            this.val = val;
        }

        public LinkNode(int val, LinkNode next){
            this.val = val;
            this.next = next;
        }

        public static void printList(LinkNode head){
            while (head!=null){
                System.out.print(head.val+" -> ");
                head = head.next;
            }
            System.out.print("NULL");
        }

        public static LinkNode insertNodeAtFirst(int val, LinkNode head){
            LinkNode cur = new LinkNode(val);

            cur.next = head;

            return cur;
        }
        public static void main(String[] args) {
            LinkNode linkNode = new LinkNode(8, new LinkNode(12, new LinkNode(15, new LinkNode(19))));

            System.out.println("************* Insert Node At First **************");


            System.out.println("Before adding node LinkedList :");
            printList(linkNode);

            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter the data which you want to add in LinkedList : ");
            int val = sc.nextInt();

           LinkNode finalList =  insertNodeAtFirst(val,linkNode);
            System.out.println("After adding node in LinkedList :");
           printList(finalList);
        }
    }
}
