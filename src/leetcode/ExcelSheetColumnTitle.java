package leetcode;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        String title = "";

        int pos = 1;
        while (n > 0) {
            if (n % 26 == 0) {
                title = 'Z' + title;
                n -= 26 ^ pos + 1;
            } else {
                char c = (char) (n % 26 + 'A' - 1);
                title = c + title;
            }
            n /= 26;
            pos++;
        }

        return title;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i + ":" + convertToTitle(i));
        }
    }
}
