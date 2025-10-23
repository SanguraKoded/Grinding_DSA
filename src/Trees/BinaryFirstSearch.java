package Trees;

import java.util.Stack;

public class BinaryFirstSearch {

    Stack<Integer> stack = new Stack<>();
    public boolean isValidBST(Node root){
        fillStack(root);
        while(!stack.isEmpty()){
            int val = stack.pop();
            if(stack.empty()){
                return true;
            }
            if(val <= stack.peek()){
                return false;
            }
        }
        return true;
    }

    public void fillStack(Node root){
        if(root == null){
            return;
        }
        if(root != null){
            fillStack(root.left);
            stack.push(root.val);
            fillStack(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);

        BinaryFirstSearch bfs = new BinaryFirstSearch();
        System.out.println(bfs.isValidBST(root)); // Output: true
    }
}
