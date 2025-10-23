package Trees;
import java.util.*;
public class BreadthFirstSearch {

    void bfs(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            Node currentNode = queue.remove();
            System.out.println(currentNode.val);
            if(currentNode.left!=null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null) {
                queue.add(currentNode.right);
            }

        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.bfs(root);
    }
}
