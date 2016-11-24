package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (numRows > 0) {
            List<Integer> first = new ArrayList<Integer>();
            first.add(1);
            list.add(first);
            if (numRows > 1) {
                List<Integer> second = new ArrayList<Integer>();
                second.add(1);
                second.add(1);
                list.add(second);
                List<Integer> temp = second;
                if (numRows > 2) {
                    for (int i = 2; i < numRows; i++) {
                        list.add(generateNextLevel(temp));
                        temp = generateNextLevel(temp);
                    }
                }
            }
        }
        return list;
    }

    public static List<Integer> generateNextLevel(List<Integer> currentLevel) {
        List<Integer> nextLevel = new ArrayList<Integer>();
        nextLevel.add(1);
        for (int i = 0; i < currentLevel.size() - 1; i++) {
            nextLevel.add(currentLevel.get(i) + currentLevel.get(i + 1));
        }
        nextLevel.add(1);
        return nextLevel;
    }
    
    public static void main(String[] args) {
        System.out.println(generate(15));
    }
}
