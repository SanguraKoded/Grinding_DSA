package Trees;

import com.sun.source.tree.Tree;

public class ArrayToBST {
    public Node arrayToBst(int[] numbers){
        return helper(numbers, 0, numbers.length-1);
    }

    public Node helper(int[] numbers, int left, int right){
        if (numbers == null) {

            return null;
        }
        if(left > right){
            return null;
        }
        int mid = left + (right - left)/2;
        Node node = new Node(numbers[mid]);
        node.left = helper(numbers, left, mid-1);
        node.right = helper(numbers, mid+1,right);

        return node;
    }
}
