package LinkedLists;

import java.util.*;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // ---------- Utility Methods ----------

    /** Create a linked list from an int array */
    public static ListNode fromArray(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    /** Convert the linked list to an int array */
    public int[] toArray() {
        List<Integer> list = new ArrayList<>();
        ListNode cur = this;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    /** Add a node at the end of the list */
    public void addNode(int val) {
        ListNode cur = this;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(val);
    }

    /** Get length of the list */
    public int length() {
        int len = 0;
        ListNode cur = this;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    /** Get node at index (0-based) */
    public ListNode getNode(int index) {
        ListNode cur = this;
        for (int i = 0; i < index && cur != null; i++) {
            cur = cur.next;
        }
        return cur;
    }

    /** String representation for quick printing */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append("->");
            cur = cur.next;
        }
        return sb.toString();
    }
}
