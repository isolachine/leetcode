package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> mapB = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            mapB.put(B[i], i);
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = mapB.get(A[i]);
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = { 12, 28, 46, 32, 50 };
        int[] B = { 50, 12, 32, 46, 28 };
        System.out.println(Arrays.toString(new FindAnagramMappings().anagramMappings(A, B)));
    }

}
