package leetcode;

public class MaximumDepthOfNAryTree {
    public int maxDepth(Node root) {
        int depth = 0;
        if (root != null) {
            depth++;
        }
        int childDepth = 0;
        for (Node child : root.children) {
            if (child != null) {
                childDepth = Math.max(childDepth, maxDepth(child));
            }
        }
        depth += childDepth;
        return depth;
    }
}
