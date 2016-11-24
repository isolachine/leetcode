package leetcode;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        char[] charArr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
            sum = (s.charAt(i) - 'A' + 1) + sum * 26;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
