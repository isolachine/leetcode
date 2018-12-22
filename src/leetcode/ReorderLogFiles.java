package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digitList = new ArrayList<>();
        List<Integer> letterIndex = new ArrayList<>();
        List<String[]> letterList = new ArrayList<>();
        int trace = 0;
        for (String log : logs) {
            if (log.charAt(log.indexOf(' ') + 1) < 'a') {
                digitList.add(log);
            } else {
                String[] logSegs = new String[] { log.substring(0, log.indexOf(' ')), log.substring(log.indexOf(' ') + 1) };
                boolean inserted = false;
                for (int i = 0; i < letterList.size(); i++) {
                    String[] logOld = letterList.get(i);
                    int comparison = logSegs[1].compareTo(logOld[1]);
                    if (comparison < 0 || (comparison == 0 && logSegs[0].compareTo(logOld[0]) < 0)) {
                        letterList.add(i, logSegs);
                        letterIndex.add(i, trace);
                        inserted = true;
                        break;
                    }
                }
                if (!inserted) {
                    letterList.add(logSegs);
                    letterIndex.add(trace);
                }
            }
            trace++;
        }
        String[] newLogs = new String[logs.length];
        for (int i = 0; i < letterList.size(); i++) {
            newLogs[i] = logs[letterIndex.get(i)];
        }
        for (int i = letterList.size(); i < newLogs.length; i++) {
            newLogs[i] = digitList.get(i - letterList.size());
        }
        return newLogs;
    }

    public static void main(String[] args) {
        String[] logs = new String[] { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo" };

        for (String string : new ReorderLogFiles().reorderLogFiles(logs)) {
            System.out.println(string);
        }
    }

}
