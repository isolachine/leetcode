package leetcode;

public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0)
                        perimeter++;
                    if (j == 0 || grid[i][j - 1] == 0)
                        perimeter++;
                    if (i == grid.length - 1 || grid[i + 1][j] == 0)
                        perimeter++;
                    if (j == grid[0].length - 1 || grid[i][j + 1] == 0)
                        perimeter++;
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        int[] a = { 1 };
//        int[] a1 = { 0, 1, 0, 0 };
//        int[] a2 = { 1, 1, 1, 0 };
//        int[] a3 = { 0, 1, 0, 0 };
//        int[] a4 = { 1, 1, 0, 0 };
        int[][] grid = { a };
        System.out.println(islandPerimeter(grid));
    }
}
