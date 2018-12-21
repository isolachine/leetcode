package leetcode;

public class DeleteColumnsToMakeSorted {

    public static void main(String[] args) {

    }

    public int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            char c = 'a';
            for (String seq : A) {
                if (seq.charAt(i) < c) {
                    count++;
                    break;
                } else {
                    c = seq.charAt(i);
                }
            }
        }
        return count;
    }

}
