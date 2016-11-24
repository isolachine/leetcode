package leetcode;

public class NimGame {
    public static boolean canWinNim(int n) {
        boolean b = false;
        if (n%4 != 0) {
            b = true;
        }
        return b;
    }
    
    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }
}
