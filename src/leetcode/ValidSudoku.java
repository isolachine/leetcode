package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isOnePartValid(board[i])) {
                return false;
            }
            char[] onePart = new char[9];
            for (int j = 0; j < 9; j++) {
                onePart[j] = board[j][i];
            }
            if (!isOnePartValid(onePart)) {
                return false;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char[] onePart = new char[9];
                for (int k = 0; k < 9; k++) {
                    onePart[k] = board[i * 3 + k % 3][j * 3 + k / 3];
                }
                if (!isOnePartValid(onePart)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isOnePartValid(char[] part) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : part) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c = '1'; c <= '9'; c++) {
            if (map.getOrDefault(c, 0) > 1) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isValidSudokuEasy(char[][] board) {
        Set<String> seen = new HashSet<String>();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[9][9];
        board[0] = "....5..1.".toCharArray();
        board[1] = ".4.3.....".toCharArray();
        board[2] = ".....5..3".toCharArray();
        board[3] = "8......2.".toCharArray();
        board[4] = "..2.7....".toCharArray();
        board[5] = ".15......".toCharArray();
        board[6] = ".....2...".toCharArray();
        board[7] = ".2.9.....".toCharArray();
        board[8] = "..4......".toCharArray();
        // ["....5..1.",".4.3.....",".....3..1","8......2.","..2.7....",".15......",".....2...",".2.9.....","..4......"]
        System.out.println(isValidSudoku(board));
    }
}
