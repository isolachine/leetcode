package leetcode;

public class SmallestGoodBase {

    public String smallestGoodBase(String n) {
        long num = Long.valueOf(n);

        for (int i = 2; i < num - 1; i++) {
            long test = num;
            while (test > 0) {
                if (test % i == 1) {
                    test /= i;
                } else {
                    break;
                }
            }
            if (test == 0) {
                return String.valueOf(i);
            }
        }
        return String.valueOf(num - 1);

    }

    public static void main(String[] args) {
        System.out.println(new SmallestGoodBase().smallestGoodBase("10000000000"));
    }

}
