public class InsertAtEnd {

    public static class LinkNode{

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

        public static void printList(LinkNode head){

//            LinkNode cur = head;
            while (head!=null){
                System.out.print(head.val+" -> ");
                head = head.next;
            }
            System.out.println("NULL");

        }

        public static LinkNode insertAtEnd(int val, LinkNode head){

            LinkNode newNode = new LinkNode(val);

            LinkNode cur = head;

            while (cur.next!=null){
                cur = cur.next;

            }
           return cur.next = newNode;
        }

        public static void main(String[] args) {
            LinkNode linkNode = new LinkNode(8, new LinkNode(12, new LinkNode(15, new LinkNode(19))));

            System.out.println("************* Insert Node At End **************");

            System.out.println(" Before adding node linkedList : ");

            printList(linkNode);

            insertAtEnd(16, linkNode);
            System.out.println(" After adding node linkedList : ");

            printList(linkNode);
        }
    }
}
