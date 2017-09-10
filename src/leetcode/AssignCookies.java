package leetcode;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sIndex = 0;
        int count = 0;
        for (int i = 0; i < g.length; i++) {
            while (sIndex < s.length) {
                if (s[sIndex] >= g[i]) {
                    count++;
                    sIndex++;
                    break;
                }
                sIndex++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = { 1, 2 };
        int[] s = { 1, 2, 3 };
        System.out.println(findContentChildren(g, s));
    }
}
