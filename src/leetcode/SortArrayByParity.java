package leetcode;

public class SortArrayByParity {

    public static void main(String[] args) {

    }

    public static int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];

        int start = 0;
        int end = A.length - 1;

        for (int i : A) {
            if (i % 2 == 0) {
                res[start++] = i;
            } else {
                res[end--] = i;
            }
        }

        return res;

    }

}
