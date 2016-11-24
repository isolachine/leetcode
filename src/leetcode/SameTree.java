package leetcode;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isSameTree = true;
        if (p == null && q == null) {
            return isSameTree;
        } else if (p != null && q == null) {
            return false;
        } else if (p == null && q != null) {
            return false;
        } else if (p.val == q.val) {
            isSameTree = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            return isSameTree;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        System.out.println(isSameTree(root, root.left));
    }
}
