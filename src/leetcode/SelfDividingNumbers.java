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
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> sdn = new ArrayList<>();
        while (left <= right) {
            String current = Integer.valueOf(left).toString();
            if (!current.contains("0")) {
                char[] cs = current.toCharArray();
                boolean flag = true;
                for (char c : cs) {
                    if (left % (c - '0') != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sdn.add(left);
                }
            }
            left++;
        }
        return sdn;
    }

    public static void main(String[] args) {
        System.out.println(new SelfDividingNumbers().selfDividingNumbers(1, 22));
    }
}
