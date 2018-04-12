package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaintHouse {

    public int minCostGood(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        for (int i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][1], costs[i - 1][0]);
        }
        int n = costs.length - 1;
        return Math.min(Math.min(costs[n][0], costs[n][1]), costs[n][2]);
    }

    public int minCost(int[][] costs) {
        if (costs.length == 0) {
            return 0;
        }
        int[][] copyArr = Arrays.copyOfRange(costs, 1, costs.length);
        int result = Math.min(costs[0][0] + minCostHelper(copyArr, 0), costs[0][1] + minCostHelper(copyArr, 1));
        result = Math.min(result, costs[0][2] + minCostHelper(copyArr, 2));
        return result;
    }

    public int minCostHelper(int[][] subCost, int omitIndex) {
        if (subCost.length == 0) {
            return 0;
        }
        int[][] copyArr = Arrays.copyOfRange(subCost, 1, subCost.length);
        List<Integer> indices = new ArrayList<Integer>(Arrays.asList(0, 1, 2));
        indices.remove(omitIndex);
        int result = Integer.MAX_VALUE;
        for (Integer index : indices) {
            result = Math.min(result, subCost[0][index] + minCostHelper(copyArr, index));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> indices = new ArrayList<Integer>(Arrays.asList(0, 1, 2));
        indices.remove(2);

        int[][] costs = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 67 } };
        int[][] sub = Arrays.copyOfRange(costs, 1, costs.length);
        sub = Arrays.copyOfRange(sub, 1, sub.length);
        sub = Arrays.copyOfRange(sub, 1, sub.length);
        System.out.println(sub);
    }

}
