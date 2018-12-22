package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        Queue<Integer> odd = new LinkedList<>();
        Queue<Integer> even = new LinkedList<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                even.add(A[i]);
            } else {
                odd.add(A[i]);
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                A[i] = even.poll();
            } else {
                A[i] = odd.poll();
            }
        }
        return A;
    }

    public int[] sortArrayByParityIIOnePass(int[] A) {
        int[] res = new int[A.length];

        int even = 0;
        int odd = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[even] = A[i];
                even += 2;
            } else {
                res[odd] = A[i];
                odd += 2;
            }
        }
        return res;
    }
}
