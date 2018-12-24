package leetcode;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuffer sb = new StringBuffer();

        int seg = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c != '-') {
                if (c >= 'a') {
                    c -= 32;
                }
                sb.append(c);
                seg++;
            }
            if (seg == K && i != 0) {
                sb.append('-');
                seg = 0;
            }
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.reverse().toString();
    }
}
