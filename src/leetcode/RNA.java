package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RNA {
    public static Map<String, Integer> memoization = new HashMap<>();

    public static int RNAPairsWithMemoization(String rna) {
        String key = rna;
        if (memoization.containsKey(key)) {
            return memoization.get(key);
        }
        int max = 0;
        if (rna.length() > 1) {
            if (pair(rna.charAt(0), rna.charAt(rna.length() - 1))) {
                if (rna.length() > 2) {
                    max = Math.max(1 + RNAPairsWithMemoization(rna.substring(1, rna.length() - 1)), max);
                } else {
                    max = Math.max(1, max);
                }
            }
            if (rna.length() > 2) {
                max = Math.max(RNAPairsWithMemoization(rna.substring(1)), max);
                max = Math.max(RNAPairsWithMemoization(rna.substring(0, rna.length() - 1)), max);
                for (int i = 1; i < rna.length(); i++) {
                    max = Math.max(RNAPairsWithMemoization(rna.substring(0, i))
                            + RNAPairsWithMemoization(rna.substring(i, rna.length())), max);
                }
            }
        }
        memoization.put(key, max);
        return max;
    }

    public static int RNAPairs(String rna) {
        int max = 0;
        if (rna.length() > 1) {
            if (pair(rna.charAt(0), rna.charAt(rna.length() - 1))) {
                if (rna.length() > 2) {
                    max = Math.max(1 + RNAPairs(rna.substring(1, rna.length() - 1)), max);
                } else {
                    max = Math.max(1, max);
                }
            }
            if (rna.length() > 2) {
                max = Math.max(RNAPairs(rna.substring(1)), max);
                max = Math.max(RNAPairs(rna.substring(0, rna.length() - 1)), max);
                for (int i = 1; i < rna.length(); i++) {
                    max = Math.max(RNAPairs(rna.substring(0, i)) + RNAPairs(rna.substring(i, rna.length())), max);
                }
            }
        }
        return max;
    }

    public static boolean pair(char a, char b) {
        if (a == 'A' && b == 'U') {
            return true;
        } else if (a == 'G' && (b == 'C' || b == 'U')) {
            return true;
        } else if (a == 'U' && (b == 'A' || b == 'G')) {
            return true;
        } else if (a == 'C' && b == 'G') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String original = "ACAGUCAGUCGAUCGAUGCUAGCUAGCUAGCUACGAUCCGAUCAGCGCGCCCGCUAUAUAAUGCAGCA"
                + "UUUGAGAGGGGGGCGAAAGGCGCGAAGAGCGAUCGACGUUUCGACGUAGCACGUA";

        for (int i = 0; i < original.length(); i++) {
            String rna = original.substring(0, i);
            System.out.println("======sequence length: " + rna.length());
            long start = System.currentTimeMillis();
            System.out.println(RNAPairsWithMemoization(rna));
            long end = System.currentTimeMillis();
            System.out.println("Execution time with memoization: " + (end - start) + "ms");

            // start = System.currentTimeMillis();
            // System.out.println(RNAPairs(rna));
            // end = System.currentTimeMillis();
            // System.out.println("Execution time without memoization: " + (end - start) + "ms");
        }
    }
}
