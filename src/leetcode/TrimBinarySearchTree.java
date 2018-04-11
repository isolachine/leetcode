package leetcode;

public class TrimBinarySearchTree {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }

        while (root != null && (root.val < L || root.val > R)) {
            if (root.val < L) {
                root = root.right;
            } else if (root.val > R) {
                root = root.left;
            }
        }

        if (root != null) {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
        }
        return root;
    }

}
