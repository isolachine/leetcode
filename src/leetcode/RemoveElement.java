package leetcode;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i + count < nums.length;) {
            if (nums[i + count] == val) {
                count++;
                while (i + count < nums.length && nums[i + count] != val) {
                    nums[i] = nums[i + count];
                    i++;
                }
            } else {
                i++;
            }
        }
        return nums.length - count;
    }
    
    public static int removeElementTwoPointers(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    
    public int removeElementRareVal(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = { 1,3,3,111,3,3,4,6,5,8,3,3 };
        System.out.println(removeElement(nums, 3));
    }
}
