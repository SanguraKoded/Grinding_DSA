package LinkedLists;

public class RemoveNthNodeFromEnd {

    public static ListNode removeNthNodeFromEnd(ListNode head, int n){
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode fast = newHead;
        ListNode slow = newHead;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        // unlink the nth node from end: slow.next is the node to remove
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return newHead.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = removeNthNodeFromEnd(head, 2);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
}
