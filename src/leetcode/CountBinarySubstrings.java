package leetcode;

public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        int count = 0;
        int first = 0;
        int second = 0;
        char last = '2';
        s = s + '2';
        for (char c : s.toCharArray()) {
            if (c == last) {
                second++;
            } else {
                count += Math.min(first, second);
                first = second;
                second = 1;
            }
            last = c;
        }
        return count;
    }

    public static void main(String[] args) {
        int res = new CountBinarySubstrings().countBinarySubstrings("10101");
        System.out.println(res);
    }

}
