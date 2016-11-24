package leetcode;

public class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        for (int i = 1; i < this.nums.length; i++) {
            this.nums[i] += this.nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return nums[j];
        }
        return nums[j] - nums[i - 1];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 1));
    }
}
