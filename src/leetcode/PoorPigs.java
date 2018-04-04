/**
 * 
 */
package leetcode;

/**
 * @author Isolachine
 *
 */
public class PoorPigs {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int tests = minutesToTest / minutesToDie + 1;
        int pigs = 0;
        int possible = 1;
        while (possible < buckets) {
            possible *= tests;
            pigs++;
        }
        return pigs;
    }

    public static void main(String[] args) {
        System.out.println(new PoorPigs().poorPigs(1, 1, 1));
    }
}
