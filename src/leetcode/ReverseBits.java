package leetcode;

public class ReverseBits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        String string = Integer.toBinaryString(n);
        if (string.length() < 32) {
            char[] com = new char[32 - string.length()];
            for (int i = 0; i < com.length; i++) {
                com[i] = '0';
            }
            string = String.valueOf(com) + string;
        }
        char[] arr = string.toCharArray();
        char[] newarr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[arr.length - 1 - i];
        }
        string = String.valueOf(newarr);
        int newint = Integer.parseUnsignedInt(string, 2);
        return newint;
    }

    public static int reverseBitsBit(int n) {
        for (int i = 0; i < 16; i++) {
            if ((((n >> i) & 1) ^ ((n >> (31 - i)) & 1)) > 0) {
                n ^= 1 << i;
                n ^= 1 << (31 - i);
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(3));
    }
}
