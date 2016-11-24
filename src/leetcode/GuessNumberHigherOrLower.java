package leetcode;

public class GuessNumberHigherOrLower {
    public static int guessNumber(int n) {
        int hi = n;
        int low = 1;
        while (hi != low) {
            int guess = (int) (hi / 2.0 + low / 2.0);
            if (guess(guess) == -1) {
                hi = guess - 1;
            } else if (guess(guess) == 1) {
                low = guess + 1;
            } else {
                return guess;
            }
        }
        return hi;
    }

    public static int guess(int num) {
        int iwant = 1702766719;
        if (num > iwant) {
            return -1;
        } else if (num < iwant) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
    }
}
