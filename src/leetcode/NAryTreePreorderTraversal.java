package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        for (Node child : root.children) {
            list.addAll(preorder(child));
        }
        return list;
    }
}
