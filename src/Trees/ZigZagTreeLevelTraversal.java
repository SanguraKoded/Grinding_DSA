package Trees;

import java.util.List;
import java.util.*;
public class ZigZagTreeLevelTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        boolean leftToRight = true;
        Queue<Node> queue  = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i<size; i++) {
                Node currentNode = queue.poll();
                if(currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
                if(leftToRight) {
                    currentLevel.add(currentNode.val);
                }
                else{
                    currentLevel.add(0, currentNode.val);
                }

            }
            result.add(currentLevel);
            leftToRight = !leftToRight;

        }
        return result;
    }

}
