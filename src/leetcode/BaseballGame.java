package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int size = list.size();
                list.add(list.get(size - 1) + list.get(size - 2));
            } else if (op.equals("D")) {
                list.add(list.get(list.size() - 1) * 2);
            } else if (op.equals("C")) {
                list.remove(list.size() - 1);
            } else {
                list.add(Integer.valueOf(op));
            }
        }

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(new BaseballGame().calPoints(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }));
    }

}
