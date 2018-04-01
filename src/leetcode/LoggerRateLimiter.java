/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Isolachine
 *
 */
public class LoggerRateLimiter {
    Map<String, Integer> map;

    /** Initialize your data structure here. */
    public LoggerRateLimiter() {
        map = new HashMap<>();
    }

    /**
     * Returns true if the message should be printed in the given timestamp, otherwise returns false. If this method returns false, the message will not be printed. The timestamp is in seconds granularity.
     */
    public boolean shouldPrintMessage(int timestamp, String message) {
        Integer last = map.getOrDefault(message, -10);
        if (timestamp - last >= 10) {
            map.put(message, timestamp);
            return true;
        }
        return false;
    }

    /**
     * Your Logger object will be instantiated and called as such: Logger obj = new Logger(); boolean param_1 = obj.shouldPrintMessage(timestamp,message);
     */
    
    public static void main(String[] args) {
        LoggerRateLimiter logger = new LoggerRateLimiter();
        System.out.println(logger.shouldPrintMessage(0, "foo"));
        System.out.println(logger.shouldPrintMessage(5, "foo"));
        System.out.println(logger.shouldPrintMessage(10, "foo"));
    }
    
}
