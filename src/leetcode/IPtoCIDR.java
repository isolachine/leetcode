package leetcode;

import java.util.ArrayList;
import java.util.List;

public class IPtoCIDR {

    public List<String> ipToCIDR(String ip, int n) {
        String[] ipString = ip.split("[.]");
        List<String> res = new ArrayList<>();
        long cur = 0;
        for (int i = 3; i >= 0; i--) {
            cur += Integer.valueOf(ipString[3 - i]) << i * 8;
        }
        while (n > 0) {
            if (cur == 0) {
                res.add("0.0.0.0/" + (32 - Integer.numberOfTrailingZeros(Integer.highestOneBit(n))));
                cur += Integer.highestOneBit(n);
                n -= Integer.highestOneBit(n);
            }
            int next = 1;
            int count = 0;
            while ((cur & (1 << count)) >> count == 0) {
                next *= 2;
                count++;
            }
            if (next > n) {
                while (next > n) {
                    next /= 2;
                    count--;
                }
            }
            res.add((cur >> 24 & 255) + "." + (cur >> 16 & 255) + "." + (cur >> 8 & 255) + "." + (cur & 255) + "/" + (32 - count));
            n -= next;
            cur += next;
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> haha = new IPtoCIDR().ipToCIDR("0.0.0.1", 543);
        for (String string : haha) {
            System.out.println(string);
        }
    }
}
