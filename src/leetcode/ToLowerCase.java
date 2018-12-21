package leetcode;

public class ToLowerCase {

    public static void main(String[] args) {
        System.out.println(toLowerCase("al&phaBET"));
    }

    public static String toLowerCase(String str) {
        int diff = 'a' - 'A';
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + diff));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
