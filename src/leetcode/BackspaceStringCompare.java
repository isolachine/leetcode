package leetcode;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        StringBuffer sbS = new StringBuffer();
        StringBuffer sbT = new StringBuffer();

        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (sbS.length() > 0) {
                    sbS.delete(sbS.length() - 1, sbS.length());
                }
            } else {
                sbS.append(c);
            }
        }

        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (sbT.length() > 0) {
                    sbT.delete(sbT.length() - 1, sbT.length());
                }
            } else {
                sbT.append(c);
            }
        }
        return sbS.toString().equals(sbT.toString());
    }

    public static void main(String[] args) {
        new BackspaceStringCompare().backspaceCompare("y#fo##f", "y#f#o##f");
    }
}
