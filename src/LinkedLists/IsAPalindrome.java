package LinkedLists;


public class IsAPalindrome {

    public static Boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        while(slow!=null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        ListNode curr = head;
        while(curr!=null && prev!=null){
            if(curr.val != prev.val){
                return false;
            }
            curr = curr.next;
            prev = prev.next;

        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}
