package leetcode;

import java.util.HashSet;
import java.util.Set;

public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                return i;
            }
        }
        return A[0];
    }
}
