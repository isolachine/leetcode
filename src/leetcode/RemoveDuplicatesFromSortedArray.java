/*
 * 26. Remove Duplicates from Sorted Array
 * 
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.

 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, 
 * with the first two elements of nums being 1 and 2 respectively. 
 * It doesn't matter what you leave beyond the new length.
 * 
 */

package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

    public static int removeDuplicatesTwoPointers(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];

            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 3, 8, 11, 11, 11 };
        System.out.println(removeDuplicatesTwoPointers(nums));
    }
}
