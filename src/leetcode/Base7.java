package leetcode;

public class Base7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        if (negative) {
            num = -num;
        }
        StringBuffer sb = new StringBuffer();
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (negative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(-10 % 7);
        System.out.println(new Base7().convertToBase7(-100));
    }

}
