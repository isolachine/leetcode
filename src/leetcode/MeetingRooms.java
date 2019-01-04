package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {
    class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public boolean canAttendMeetings(Interval[] intervals) {
        Comparator<Interval> comparator = new Comparator<MeetingRooms.Interval>() {

            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start == o2.start) {
                    return o1.end - o2.end;
                }
                return o1.start - o2.start;
            }

        };

        Arrays.sort(intervals, comparator);

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i + 1].start < intervals[i].end) {
                return false;
            }
        }
        return true;
    }
}
