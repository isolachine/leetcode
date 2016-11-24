package leetcode;

public class PathSumIII {
    public static int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.val == sum) {
            count++;
        }
//        if (root.left != null) {
            count = count + pathSumHelper(root.left, sum - root.val) + pathSum(root.left, sum);
//        }
//        if (root.right != null) {
            count = count + pathSumHelper(root.right, sum - root.val) +  + pathSum(root.right, sum);
//        }
        return count;
    }
    
    public static int pathSumHelper(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.val == sum) {
            count++;
        }
//        if (root.left != null) {
            count = count + pathSumHelper(root.left, sum - root.val);
//        }
//        if (root.right != null) {
            count = count + pathSumHelper(root.right, sum - root.val);
//        }
        return count;
    }
    
    public static void main(String[] args) {
        TreeNode root = null;//new TreeNode(10);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(-3);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(2);
//        root.right.right = new TreeNode(11);
//        root.left.left.left = new TreeNode(4);
//        root.left.left.right = new TreeNode(-2);
//        root.left.right.right = new TreeNode(1);
        System.out.println(pathSum(root, 8));
    }
}
