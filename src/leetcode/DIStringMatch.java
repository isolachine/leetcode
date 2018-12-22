package leetcode;

public class DIStringMatch {
    public int[] diStringMatchElegant(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }

    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] res = new int[N + 1];

        int dec = 0;
        int inc = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'D') {
                dec++;
            } else {
                inc++;
            }
        }

        inc = N - inc;
        if (S.charAt(0) == 'D') {
            inc++;
            res[0] = dec--;
        } else {
            dec--;
            res[0] = inc++;
        }

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'D') {
                res[i + 1] = dec--;
            } else {
                res[i + 1] = inc++;
            }
        }

        return res;
    }

}
