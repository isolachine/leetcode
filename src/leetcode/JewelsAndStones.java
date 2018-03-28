/**
 * 
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Isolachine
 *
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Set<Character> cs = new HashSet<>();
        for (Character c : J.toCharArray()) {
            cs.add(c);
        }
        int count = 0;
        for (Character c : S.toCharArray()) {
            if (cs.contains(c)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new JewelsAndStones().numJewelsInStones("aA", "aAABbs"));
    }

}
