/**
 * 
 */
package leetcode;

/**
 * @author Isolachine
 *
 */
public class NumberComplement {

    public int findComplement(int num) {
        int high = Integer.highestOneBit(num);
        high += high - 1;
        return num ^ high;
    }
    
    public static void main(String[] args) {
        System.out.println(new NumberComplement().findComplement(11));
    }

}
