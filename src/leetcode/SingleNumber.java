package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.remove(i);
            } else {
                map.put(i, i);
            }
        }
        return map.keySet().iterator().next();
    }
    
    //运用XOR运算符，巧解！
    //a^a^b = b
    //a^b^c^b^a = c
    //二进制对位运算，例：
    //      010
    //XOR   110 
    // =    100
    public static int singleNumberBestSolution(int[] nums) {
        int result = 0;
        for (int n : nums) {
        result = result ^ n;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 3};
        System.out.println(singleNumber(arr));
    }
}
