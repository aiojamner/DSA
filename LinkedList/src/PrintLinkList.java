public class PrintLinkList {

  public static class LinkNode{
        int val;
        LinkNode next;

        public LinkNode(int val){
            this.val = val;
        }
        public LinkNode(){}

        public LinkNode(int val, LinkNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkNode linkNode = new LinkNode(10,new LinkNode(13,new LinkNode(18, new LinkNode(20))));

        System.out.println("LinkedList : ");
        printList(linkNode);
    }

    public static void printList(LinkNode head){
        while (head!=null){
            System.out.print(+head.val+" -> ");
            head = head.next;
        }
        System.out.print("NULL");
    }
}
