package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

    public List<String> generatePossibleNextMoves(String s) {
        List<String> answers = new ArrayList<>();
        if (s.length() < 2) {
            return answers;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
                StringBuffer newAns = new StringBuffer(s);
                newAns.setCharAt(i, '-');
                newAns.setCharAt(i - 1, '-');
                answers.add(newAns.toString());
            }
        }

        return answers;
    }

    public static void main(String[] args) {

    }

}
