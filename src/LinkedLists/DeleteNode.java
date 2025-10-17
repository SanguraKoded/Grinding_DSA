package LinkedLists;
import java.util.*;
public class DeleteNode {

    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
