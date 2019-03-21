package leetcode;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        boolean changed = false;
        while (!changed) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2) {
                        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                            grid[i - 1][j] = 3;
                            changed = true;
                        }
                        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                            grid[i][j + 1] = 3;
                            changed = true;
                        }
                        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                            grid[i + 1][j] = 3;
                            changed = true;
                        }
                        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                            grid[i][j - 1] = 3;
                            changed = true;
                        }
                    }
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 3) {
                        grid[i][j] = 2;
                    }
                }
            }
            if (changed) {
                time++;
                changed = false;
            } else {
                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[0].length; j++) {
                        if (grid[i][j] == 1) {
                            return -1;
                        }
                    }
                }
                return time;
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        System.out.println(new RottingOranges().orangesRotting(grid));
    }
}
