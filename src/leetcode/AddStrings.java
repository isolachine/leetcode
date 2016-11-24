package leetcode;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int carry = 0;
        char[] zeroes = new char[num1.length() > num2.length() ? num1.length() - num2.length() : num2.length() - num1.length()];
        for (int i = 0; i < zeroes.length; i++) {
            zeroes[i] = '0';
        }
        if (num1.length() > num2.length()) {
            num2 = String.valueOf(zeroes) + num2;
        } else {
            num1 = String.valueOf(zeroes) + num1;
        }
        char[] cArr = new char[num1.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int sum = num1.charAt(i) + num2.charAt(i) - 2 * '0' + carry;
            cArr[i] = (char) (sum % 10 + '0');
            carry = sum / 10; 
        }
        
        if (carry == 1) {
            return "1" + String.valueOf(cArr);
        }
        return String.valueOf(cArr);
    }
    
    public static void main(String[] args) {
        long begin, end;
        begin = System.currentTimeMillis();
        System.out.println(addStrings("23131231232132132", "21321132142443434123123123123124345435435456658667549"));
        end = System.currentTimeMillis();
        System.out.println((end - begin)
          + " millis has elapsed when used String. ");
        
    }
}
