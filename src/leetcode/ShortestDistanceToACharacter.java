package leetcode;

public class ShortestDistanceToACharacter {
    public static int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];

        int slow = 0;
        int fast = S.indexOf(C, slow);

        for (int i = slow; i <= fast; i++) {
            res[i] = fast - i;
        }

        while (fast != -1) {
            slow = fast;
            fast = S.indexOf(C, slow + 1);
            for (int i = slow; i <= fast; i++) {
                res[i] = Math.min(fast - i, i - slow);
            }
        }

        for (int i = slow; i < res.length; i++) {
            res[i] = i - slow;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] res = shortestToChar("loveleetcode", 'e');
        for (int i : res) {
            System.out.print(i + ",");
        }
    }

}
