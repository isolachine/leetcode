package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static String concat = "->";

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if (root == null) {
            return paths;
        }
        onePath(paths, root, "");
        return paths;
    }

    public static void onePath(List<String> paths, TreeNode node, String prev) {
        if (prev.equals("")) {
            prev += node.val;
        } else {
            prev += concat + node.val;
        }
        if (node.left == null && node.right == null) {
            paths.add(prev);
        }
        if (node.left != null) {
            onePath(paths, node.left, prev);
        }
        if (node.right != null) {
            onePath(paths, node.right, prev);
        }
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        System.out.println(binaryTreePaths(root));
    }
}
