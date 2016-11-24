package leetcode;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
		int length = nums.length;
		if (k > length) {
			k = k % length;
		}
		int[] kNums = new int[k];
		for (int i = 0; i < k; i++) {
			kNums[i] = nums[length - k + i];
		}
		for (int i = length - 1; i >= k; i--) {
			nums[i] = nums[i - k];
		}
		for (int i = 0; i < k; i++) {
			nums[i] = kNums[i];
		}
	}

	public void rotateGCD(int[] nums, int k) {
		if (nums.length <= 1) {
			return;
		}
		k = k % nums.length;
		int gcd = findGcd(nums.length, k);
		int position, count;
		for (int i = 0; i < gcd; i++) {
			position = i;
			count = nums.length / gcd - 1;
			for (int j = 0; j < count; j++) {
				position = (position + k) % nums.length;
				nums[i] ^= nums[position];
				nums[position] ^= nums[i];
				nums[i] ^= nums[position];
			}
		}
	}

	public int findGcd(int a, int b) {
		return (a == 0 || b == 0) ? a + b : findGcd(b, a % b);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2 };
		rotate(nums, 3);
		System.out.println("aaa");
	}
}
