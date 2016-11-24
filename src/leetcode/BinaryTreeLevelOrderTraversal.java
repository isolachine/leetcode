package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        addLevel(root, 0, result);
        return result;
    }
    
    private static void addLevel(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (result.size() <= level) {
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(root.val);
        addLevel(root.left, level + 1, result);
        addLevel(root.right, level + 1, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        System.out.println(levelOrder(root));
    }
}
