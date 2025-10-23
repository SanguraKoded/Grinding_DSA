package Trees;

import java.util.*;

public class BinaryTreeFromTraversal {
    HashMap<Integer, Integer> inOrderMap = new HashMap<>();
    int preOrderCounter = 0;

    public Node buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i<inorder.length; i++){
            inOrderMap.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length-1);
    }
    public Node helper(int[] preorder, int left, int right){
        if(left > right){
            return null;
        }
        int rootNum = preorder[preOrderCounter++];
        Node root = new Node(rootNum);
        root.left = helper(preorder, left, inOrderMap.get(rootNum)-1);
        root.right = helper(preorder, inOrderMap.get(rootNum)+1, right);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeFromTraversal treeBuilder = new BinaryTreeFromTraversal();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Node root = treeBuilder.buildTree(preorder, inorder);
        System.out.println("Root: " + root.val); // Should print 3
        System.out.println("Left Child of Root: " + root.left.val); // Should print 9
        System.out.println("Right Child of Root: " + root.right.val); // Should print 20
    }
}
