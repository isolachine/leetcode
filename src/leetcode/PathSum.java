package leetcode;

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
         root.left = new TreeNode(5);
         root.right = new TreeNode(-3);
         root.left.left = new TreeNode(3);
        // root.left.right = new TreeNode(2);
         root.right.right = new TreeNode(4);
        // root.left.left.left = new TreeNode(4);
         root.left.left.right = new TreeNode(-8);
        // root.left.right.right = new TreeNode(-1);
        System.out.println(hasPathSum(root, 8));
    }
}
