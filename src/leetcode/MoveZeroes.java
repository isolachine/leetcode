package leetcode;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        int countBack = nums.length - 1;
        int[] newArr = new int[nums.length];
        for (int i : nums) {
            if (i != 0) {
                newArr[count] = i;
                count++;
            } else {
                newArr[countBack] = 0;
                countBack--;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            nums[i] = newArr[i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
