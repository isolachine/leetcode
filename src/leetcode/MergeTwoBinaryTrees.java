package leetcode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode merge = null;
        int val = 0;
        if (t1 != null || t2 != null) {
            if (t1 != null) {
                val += t1.val;
            }
            if (t2 != null) {
                val += t2.val;
            }
            merge = new TreeNode(val);
            mergeHelper(t1, t2, merge);
        }
        return merge;
    }

    public void mergeHelper(TreeNode t1, TreeNode t2, TreeNode merge) {
        int left = 0;
        int right = 0;
        if (t1 == null && t2 == null) {
            return;
        } else if (t1 == null) {
            merge.left = t2.left;
            merge.right = t2.right;
        } else if (t2 == null) {
            merge.left = t1.left;
            merge.right = t1.right;
        } else {
            if (t1.left != null || t2.left != null) {
                if (t1.left != null) {
                    left += t1.left.val;
                }
                if (t2.left != null) {
                    left += t2.left.val;
                }
                merge.left = new TreeNode(left);
                mergeHelper(t1.left, t2.left, merge.left);
            }
            if (t1.right != null || t2.right != null) {
                if (t1.right != null) {
                    right += t1.right.val;
                }
                if (t2.right != null) {
                    right += t2.right.val;
                }
                merge.right = new TreeNode(right);
                mergeHelper(t1.right, t2.right, merge.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
//        t1.left = new TreeNode(3);
//        t1.right = new TreeNode(2);
//        t1.left.left = new TreeNode(5);
//        TreeNode t2 = new TreeNode(2);
//        t2.left = new TreeNode(1);
//        t2.right = new TreeNode(3);
//        t2.left.right = new TreeNode(4);
//        t2.right.right = new TreeNode(7);
        TreeNode t2 = null;
        TreeNode merge = new MergeTwoBinaryTrees().mergeTrees(t1, t2);
        System.out.println(merge);
    }
}