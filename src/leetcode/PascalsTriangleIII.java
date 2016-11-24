package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 0; i < rowIndex; i++) {
            row = generateNextLevel(row);
        }
        return row;
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
    
    
    public List<Integer> getRowFast(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex < 0)
            return list;

        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            System.out.println(i + " : " + getRow(i));
        }
    }
}
