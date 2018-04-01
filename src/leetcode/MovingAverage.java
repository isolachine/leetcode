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
public class MovingAverage {
    int size;
    int current;
    List<Integer> list;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
        this.current = 0;
        list = new ArrayList<>();
    }

    public double next(int val) {
        current++;
        list.add(val);
        int sum = 0;
        if (current > size) {
            list.remove(0);
            for (Integer integer : list) {
                sum += integer;
            }
            return sum * 1.0 / size;
        } else {
            for (Integer integer : list) {
                sum += integer;
            }
            return sum * 1.0 / current;
        }
    }

    /**
     * Your MovingAverage object will be instantiated and called as such: MovingAverage obj = new MovingAverage(size); double param_1 = obj.next(val);
     */
    public static void main(String[] args) {
        MovingAverage obj = new MovingAverage(3);
        System.out.println(obj.next(1));
        System.out.println(obj.next(5));
        System.out.println(obj.next(3));
        System.out.println(obj.next(10));
    }
}
