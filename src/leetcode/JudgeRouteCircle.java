package leetcode;

public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
            case 'U':
                vertical--;
                break;
            case 'D':
                vertical++;
                break;
            case 'R':
                horizontal++;
                break;
            case 'L':
                horizontal--;
                break;
            default:
                break;
            }
        }
        if (horizontal == 0 && vertical == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
