/*
 * 110. Balanced Binary Tree
 * 
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree 
 * in which the depth of the two subtrees of every node never differ by more than 1.
 * 
 */
package leetcode;

public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        return pathLength(root, 0) >= 0;
    }

    public static int pathLength(TreeNode node, int level) {
        if (node == null) {
            return level;
        }
        int leftTree = pathLength(node.left, level + 1);
        int rightTree = pathLength(node.right, level + 1);
        if (leftTree < 0 || rightTree < 0 || Math.abs(leftTree - rightTree) > 1) {
            return -1;
        }
        return Math.max(leftTree, rightTree);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);
        root.right.left.right = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
        root.left.left.left.right = new TreeNode(5);
        System.out.println(isBalanced(root));
    }
}
