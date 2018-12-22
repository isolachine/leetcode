package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();

        list.add(root.val);
        if (root.children.size() != 0) {
            for (Node child : root.children) {
                list.addAll(postorder(child));
            }
        }

        return list;

    }
}
