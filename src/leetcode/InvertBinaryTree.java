package leetcode;

public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root != null) {
            if (root.left != null || root.right != null) {
                TreeNode tempNode = root.left;
                root.left = root.right;
                root.right = tempNode;
                invertTree(root.left);
                invertTree(root.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root = invertTree(root);
        System.out.println(root.left.val);
    }
}
