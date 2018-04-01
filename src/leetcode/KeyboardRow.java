/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isolachine
 *
 */
public class KeyboardRow {
    String[] rows = new String[] { "QWERTYUIOPqwertyuiop", "ASDFGHJKLasdfghjkl", "ZXCVBNMzxcvbnm" };

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String str : words) {
            int row;
            char c = str.charAt(0);
            if (rows[0].indexOf(c) != -1) {
                row = 0;
            } else if (rows[1].indexOf(c) != -1) {
                row = 1;
            } else {
                row = 2;
            }
            boolean flag = true;
            for (char cc : str.toCharArray()) {
                if (rows[row].indexOf(cc) == -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] words = new String[] { "Hello", "Alaska", "Dad", "Peace" };
        String[] newWords = new KeyboardRow().findWords(words);
        for (String string : newWords) {
            System.out.println(string);
        }
    }
}
