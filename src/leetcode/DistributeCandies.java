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
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        if (set.size() > candies.length / 2) {
            return candies.length / 2;
        }
        return set.size();
    }

    public static void main(String[] args) {

    }
}
