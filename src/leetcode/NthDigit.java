package leetcode;

public class NthDigit {
    public static int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        int number = 9;
        long number2 = 9;
        long exp = 1;
        int digits = 1;
        while (number2 < n) {
            exp *= 10;
            digits++;
            number2 = number2 + number * exp * digits;
        }
        number2 = number2 - number * exp * digits;
        long diff = n - number2;
        int num = (int) Math.ceil(diff * 1.0 / digits);
        long position = diff % digits == 0 ? digits : diff % digits;
        int finalNum = (int) (num + Math.pow(10, digits - 1) - 1);
        for (int i = 0; i < digits - position; i++) {
            finalNum = finalNum / 10;
        }
        return finalNum % 10;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
            System.out.println(findNthDigit(1000000000));
//        }
    }
}
