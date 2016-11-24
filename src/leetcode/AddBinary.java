package leetcode;

public class AddBinary {
    public static String addBinary(String a, String b) {
        char[] com = new char[Math.abs(a.length() - b.length())];
        for (int i = 0; i < com.length; i++) {
            com[i] = '0';
        }
        String complement = String.valueOf(com);
        if (a.length() > b.length()) {
            b = complement + b;
        } else {
            a = complement + a;
        }
        int carry = 0;
        char[] sum = new char[a.length()];
        for (int i = a.length() - 1; i >= 0; i--) {
            sum[i] = (a.charAt(i) + b.charAt(i) + carry - 2 * '0' == 1
                    || a.charAt(i) + b.charAt(i) + carry - 2 * '0' == 3) ? '1' : '0';
            carry = a.charAt(i) + b.charAt(i) + carry - 2 * '0' > 1 ? 1 : 0;
        }
        String res = String.valueOf(sum);
        if (carry == 1) {
            res = "1" + res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
