package leetcode;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        boolean[] missing = new boolean[nums.length + 1];

        for (int num : nums) {
            missing[num] = true;
        }
        for (int i = 0; i < missing.length; i++) {
            if (missing[i] == false) {
                return i;
            }
        }
        return 0;
    }
}
