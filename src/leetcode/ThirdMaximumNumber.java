package leetcode;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0] >= nums[1] ? nums[0] : nums[1];
        }
        int max1 = Math.max(nums[2], Math.max(nums[0], nums[1]));
        int max2;
        if ((nums[0] >= nums[1] && nums[1] >= nums[2]) || (nums[0] <= nums[1] && nums[1] <= nums[2])) {
            max2 = nums[1];
        } else if ((nums[0] >= nums[2] && nums[2] >= nums[1]) || (nums[0] <= nums[2] && nums[2] <= nums[1])) {
            max2 = nums[2];
        } else {
            max2 = nums[0];
        }
        int max3 = Math.min(nums[2], Math.min(nums[0], nums[1]));
        for (int i = 3; i < nums.length; i++) {
            if (max1 == max2 && nums[i] < max1) {
                max2 = nums[i];
                continue;
            } else if (max2 == max3 && nums[i] < max2) {
                max3 = nums[i];
                continue;
            } else if (max1 == max3 && nums[i] < max3) {
                max3 = nums[i];
                continue;
            }
            if (max1 < nums[i]) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] < max1 && nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (max3 < nums[i] && nums[i] < max2) {
                max3 = nums[i];
            }
        }
        if (max3 == max1 || max3 == max2 || max1 == max2) {
            return max1;
        } else {
            return max3;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1,-2147483648,2 };
        System.out.println(thirdMax(nums));
    }
}
