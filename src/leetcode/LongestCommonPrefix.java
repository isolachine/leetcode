package leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String common = "";
        if (strs.length > 0) {
            common = strs[0];
        }
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < common.length(); j++) {
                if (strs[i].length() == j || strs[i].charAt(j) != common.charAt(j)) {
                    common = common.substring(0, j);
                }
            }
        }
        return common;
    }

    public String longestCommonPrefixFast(String[] strs) {
        String res = strs.length == 0 ? "" : strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(res) != 0)
                res = res.substring(0, res.length() - 1);
        return res;
    }

    public static void main(String[] args) {
        String[] strings = { "b", "aab", "aac", "aa" };
        System.out.println(longestCommonPrefix(strings));
    }

}
