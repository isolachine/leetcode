package leetcode;

public class BattleshipsInABoard {
    public static int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                    int add = 1;
                    boolean go = false;
                    while (i + add < board.length) {
                        if (board[i + add][j] == 'X') {
                            board[i + add][j] = '.';
                            add++;
                            go = true;
                        } else {
                            add = 1;
                            break;
                        }
                    }
                    if (!go) {
                        while (j + add < board[i].length) {
                            if (board[i][j + add] == 'X') {
                                board[i][j + add] = '.';
                                add++;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    
    
    public static void main(String[] args) {
        char[] r1 = {'X','.','.','X'};
        char[] r2 = {'.','.','.','X'};
        char[] r3 = {'.','.','.','X'};
//        char[] r4 = {'.','.','.','.'};
        char[][] board = {r1, r2, r3};
        
        
        System.out.println(countBattleships(board));
    }
}
