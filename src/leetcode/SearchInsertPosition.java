package leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 5, 7 };
        int target = 6;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int hi = nums.length - 1;
        int lo = 0;
        while (hi >= lo) {
            int mid = (hi + lo) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

}
