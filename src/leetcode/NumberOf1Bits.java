package leetcode;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        long l = n > 0 ? n : 4294967296l + n;
        int count = 0;
        while (l > 0) {
            if (l % 2 == 1) {
                count++;
            }
            l /= 2;
        }
        return count;
    }
    
    public static int hammingWeightBitShifting(int n) {
        int ones = 0;
            while(n!=0) {
                ones = ones + (n & 1);
                n = n>>>1;
            }
            return ones;
    }
    
    public static void main(String[] args) {
        for (int i = 0; i <= 16; i++) {
            System.out.println(hammingWeight((int) 2147483648l) + ": " + Integer.bitCount((int) 2147483648l));
            
        }
        
    }
}
