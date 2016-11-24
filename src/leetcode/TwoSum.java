package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int count = nums.length;
        int indice1 = 0;
        int indice2 = 1;
        while (nums[indice1] + nums[indice2] != target) {
            if (indice2 + 1 == count) {
                indice1++;
                indice2 = indice1 + 1;
            } else {
                indice2++;
            }
        }
        int[] indices = { indice1, indice2 };
        return indices;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 12 };
        int tar = 20;
        System.out.println(Arrays.toString(twoSum(arr, tar)));
    }
}
