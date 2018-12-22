package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {
    List<Integer> list;

    public RecentCounter() {
        list = new ArrayList<>();
    }

    public int ping(int t) {
        list.add(t);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < t - 3000) {
                list.remove(i);
                i--;
            } else {
                break;
            }
        }
        return list.size();
    }
}
