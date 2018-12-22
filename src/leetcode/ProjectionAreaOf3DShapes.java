package leetcode;

public class ProjectionAreaOf3DShapes {
    public int projectionArea(int[][] grid) {
        int xy = 0;
        int[] xz = new int[grid.length];
        int[] yz = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int cell = grid[i][j];
                if (cell > 0) {
                    xy++;
                }
                xz[i] = Math.max(xz[i], cell);
                yz[i] = Math.max(yz[i], grid[j][i]);
            }
        }

        for (int i = 0; i < xz.length; i++) {
            xy += xz[i] + yz[i];
        }
        return xy;
    }
}
