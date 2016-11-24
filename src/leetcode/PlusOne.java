package leetcode;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry + digits[i] == 10) {
                carry = 1;
                digits[i] = 0;
            } else {
                digits[i] += carry;
                carry = 0;
            }
        }
        if (digits[0] == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
            }
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = { 9, 9 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
