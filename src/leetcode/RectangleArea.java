package leetcode;

public class RectangleArea {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int rect1 = (C - A) * (D - B);
        int rect2 = (G - E) * (H - F);
        if (A >= G || C <= E || B >= H || D <= F) {
            return rect1 + rect2;
        }
        int x = Math.min(C, G) - Math.max(A, E);
        int y = Math.min(D, H) - Math.max(B, F);
        int rect3 = x * y;
        return rect1 - rect3 + rect2;
    }

    public static void main(String[] args) {
        System.out.println(computeArea(-2, -2, 2, 2, -3, -3, 3, -1));
    }
}
