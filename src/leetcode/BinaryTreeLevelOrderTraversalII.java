package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        dummy.left = root;
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        nodes.add(dummy);
        List<List<Integer>> listList = new ArrayList<List<Integer>>();

        List<TreeNode> tempNodes = new ArrayList<TreeNode>();
        do {
            tempNodes = new ArrayList<TreeNode>();
            List<Integer> list = new ArrayList<Integer>();
            for (TreeNode node : nodes) {
                if (node.left != null) {
                    tempNodes.add(node.left);
                    list.add(node.left.val);
                }
                if (node.right != null) {
                    tempNodes.add(node.right);
                    list.add(node.right.val);
                }
            }
            if (!tempNodes.isEmpty()) {
                listList.add(list);
                nodes = tempNodes;
            }
        } while (!tempNodes.isEmpty());
        Collections.reverse(listList);
        return listList;
    }
    
    public static List<List<Integer>> levelOrderBottomFast(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        addLevel(root, 0, result);
        Collections.reverse(result);
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
        System.out.println(levelOrderBottom(root));
    }
}
