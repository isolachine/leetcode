package leetcode;

public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, 0);
    }

    public static int helper(TreeNode node, int prev) {
        if (node == null) {
            return prev;
        }
        if (node.left == null && node.right == null) {
            return prev + 1;
        }
        if (node.left == null) {
            return helper(node.right, prev + 1);
        }
        if (node.right == null) {
            return helper(node.left, prev + 1);
        }
        return Math.min(helper(node.left, prev + 1), helper(node.right, prev + 1));
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        // treeNode.left.right = new TreeNode(3);
//        treeNode.right.right = new TreeNode(3);
        // treeNode.right.left = new TreeNode(3);
        System.out.println(minDepth(treeNode));
    }
}
