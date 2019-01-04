package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIII {

    private Map<Integer, Integer> map;

    /** Initialize your data structure here. */
    public TwoSumIII() {
        map = new HashMap<>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (Integer num : map.keySet()) {
            if (value == (2 * num)) {
                if (map.get(num) > 1) {
                    return true;
                }
            } else {
                if (map.keySet().contains(value - num)) {
                    return true;
                }
            }
        }
        return false;
    }
}
