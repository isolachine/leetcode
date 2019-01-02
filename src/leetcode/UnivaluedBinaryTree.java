package leetcode;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        int rootVal = root.val;
        return checkChildren(root, rootVal);
    }

    public boolean checkChildren(TreeNode node, int val) {
        if (node == null) {
            return true;
        } else if (node.val != val) {
            return false;
        } else {
            return checkChildren(node.left, val) && checkChildren(node.right, val);
        }
    }
}
