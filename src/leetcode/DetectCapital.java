package leetcode;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }

        if (word.charAt(0) <= 'Z') {
            if (word.charAt(1) <= 'Z') {
                for (char c : word.toCharArray()) {
                    if (c >= 'a') {
                        return false;
                    }
                }
            } else {
                for (char c : word.substring(2).toCharArray()) {
                    if (c < 'a') {
                        return false;
                    }
                }
            }
        } else {
            for (char c : word.toCharArray()) {
                if (c < 'a') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new DetectCapital().detectCapitalUse("O"));
    }

}
