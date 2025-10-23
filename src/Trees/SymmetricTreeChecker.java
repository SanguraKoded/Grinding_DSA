package Trees;

public class SymmetricTreeChecker {

    public boolean isSymmetric(Node root){
        if(root==null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(Node root1, Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }
}
