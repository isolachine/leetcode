package leetcode;

public class ReverseInteger {
	public static int reverse(int x) {
		boolean negative = x < 0;
		if (negative)
			x = -x;
		long newint = 0;
		while (x > 0) {
			newint = newint * 10 + x % 10;
			x /= 10;
		}
		if (newint > Integer.MAX_VALUE || newint < Integer.MIN_VALUE) {
			newint = 0;
		}
		if (negative)
			newint = -newint;
		return (int) newint;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1000000003));
	}
}
