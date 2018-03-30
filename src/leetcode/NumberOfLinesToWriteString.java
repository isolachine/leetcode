package leetcode;

public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        if (S.length() == 0) {
            return new int[] { 0, 0 };
        }
        int lines = 1;
        int length = 0;
        for (char c : S.toCharArray()) {
            if (length + widths[c - 'a'] > 100) {
                lines++;
                length = widths[c - 'a'];
            } else {
                length += widths[c - 'a'];
            }
        }
        return new int[] {lines, length};
    }

    public static void main(String[] args) {

    }

}
