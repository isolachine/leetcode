package leetcode;

public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        char[] c = num.toCharArray();
        int length = c.length;
        for (int i = 0; i < (length + 1) / 2; i++) {
            if ((c[i] == '1' || c[i] == '8' || c[i] == '0') && c[length - 1 - i] == c[i]) {
                continue;
            } else if (c[i] == '6' && c[length - 1 - i] == '9') {
                continue;
            } else if (c[i] == '9' && c[length - 1 - i] == '6') {
                continue;
            } else
                return false;
        }
        return true;
    }
}
