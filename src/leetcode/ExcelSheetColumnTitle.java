package leetcode;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        while (n > 0) {
            stringBuilder.append(n % 26 + 'A');
        }

        return "A";
    }
}
