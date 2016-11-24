package leetcode;

public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        int carry = a & b;
        int result = a ^ b;
        while (carry != 0) {
            int carry_t = carry << 1;
            carry = carry_t & result;
            result = result ^ carry_t;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 3));
    }
}
