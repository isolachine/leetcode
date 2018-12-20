/**
 * 
 */
package leetcode;

/**
 * @author Isolachine
 *
 */
public class MaximumSubarray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[] { -2, 1, -3, 4, -3, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int maxAtI = nums[0];
        int currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxAtI < 0) {
                maxAtI = nums[i];
            } else {
                maxAtI += nums[i];
            }
            currMax = Math.max(currMax, maxAtI);
        }
        return currMax;
    }
}
