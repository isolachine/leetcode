package leetcode;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] strings = new String[26];
        char[] patternArr = pattern.toCharArray();
        char[] strArr = str.toCharArray();
        int spaceCount = 0;
        for (char c : strArr) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        if (spaceCount != pattern.length() - 1) {
            return false;
        }
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < patternArr.length; i++) {
            endIndex++;
            while (endIndex < str.length() && str.charAt(endIndex) != ' ') {
                endIndex++;
            }
            String word = str.substring(startIndex, endIndex);
            if (strings[patternArr[i] - 'a'] == null) {
                for (String s : strings) {
                    if (s != null && s.equals(word)) {
                        return false;
                    }
                }
                strings[patternArr[i] - 'a'] = word;
            } else if (!strings[patternArr[i] - 'a'].equals(word)) {
                return false;
            }
            startIndex = endIndex + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("aaaa", "aa aa aa"));
    }
}
