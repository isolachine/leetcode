package leetcode;

public class ReadNCharactersGivenRead4 {

    public static void main(String[] args) {
        char[] buf = new char[] {};
        int n = 1;
        System.out.println(new ReadNCharactersGivenRead4().read(buf, n));
    }

    public int read(char[] buf, int n) {
        char[] temp = new char[4];
        int total = 0;
        while (total < n) {
            int count = read4(temp);
            count = Math.min(count, n - total);
            if (count == 0) {
                break;
            }
            for (int i = 0; i < count; i++) {
                buf[total++] = temp[i];
            }
        }
        return total;
    }

    private int read4(char[] buf) {
        if (buf.length >= 4) {
            return 4;
        }
        return buf.length;
    }
}
