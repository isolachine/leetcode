package leetcode;

public class LowestCommonAncestorOfABinarySearchTree {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.equals(p) || root.equals(q)) {
            return root;
        }
        boolean pBranch = inLeftBranch(root, p);
        boolean qBranch = inLeftBranch(root, q);
        if (qBranch && pBranch) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (!qBranch && !pBranch) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static boolean inBranch(TreeNode root, TreeNode p) {
        if (root.equals(p)) {
            return true;
        } else {
            if (root.left != null && root.right != null) {
                return inBranch(root.left, p) || inBranch(root.right, p);
            } else if (root.left != null) {
                return inBranch(root.left, p);
            } else if (root.right != null){
                return inBranch(root.right, p);
            } else {
                return false;
            }
        }
    }
    
    public static boolean inLeftBranch(TreeNode root, TreeNode p) {
        if (root == null) {
            return false;
        }
        if (root.equals(p)) {
            return true;
        } else {
            if (root.left != null) {
                return inBranch(root.left, p);
            }
            return false;
        }
    }
    
    //Value Method
    public TreeNode lowestCommonAncestorValue(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        System.out.println(lowestCommonAncestor(root, root.right.left, root.right).val);
    }
}
