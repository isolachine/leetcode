package leetcode;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int diameter = depthOfTree(root.left) + depthOfTree(root.right);

        int ldia = diameterOfBinaryTree(root.left);
        int rdia = diameterOfBinaryTree(root.right);
        return Math.max(diameter, Math.max(ldia, rdia));

    }

    public int depthOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 1 + Math.max(depthOfTree(root.left), depthOfTree(root.right));
        return depth;
    }

}
