package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = sequence(root1, new ArrayList<>());
        List<Integer> list2 = sequence(root2, new ArrayList<>());

        if (list1.equals(list2)) {
            return true;
        }
        return false;

    }

    public List<Integer> sequence(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        } else {
            list = sequence(root.left, list);
            list = sequence(root.right, list);
            return list;
        }

    }
}
