package leetcode;

public class MaximumBinaryTreeNode {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
    
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        System.out.println(maxDepth(treeNode));
    }
}
