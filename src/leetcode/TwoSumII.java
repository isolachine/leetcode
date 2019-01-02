package leetcode;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int first = 0, last = numbers.length - 1;
        while (numbers[first] + numbers[last] != target) {
            if (numbers[first] + numbers[last] > target) {
                last--;
            } else {
                first++;
            }
        }
        return new int[] { first + 1, last + 1 };
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[] { 2, 3, 4 }, 6));
    }
}
