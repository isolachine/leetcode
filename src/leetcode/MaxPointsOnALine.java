package leetcode;

public class MaxPointsOnALine {
    public static int maxPoints(Point[] points) {
        if (points.length <= 1) {
            return points.length;
        }
        int result = 2;
        for (int i = 0; i < points.length; i++) {
            int tempCon = 2;
            for (int j = i + 1; j < points.length; j++) {
                int temp = tempCon;
                int dx = points[i].x - points[j].x;
                int dy = points[i].y - points[j].y;
                for (int k = j + 1; k < points.length; k++) {
                    if (dy == 0 && dx == 0) {
                        tempCon++;
                        break;
                    }
                    int ddx = points[k].x - points[j].x;
                    int ddy = points[k].y - points[j].y;
                    if (ddx == 0 && ddy == 0) {
                        temp++;
                    } else if (dx == 0 || ddx == 0) {
                        if (dx == ddx) {
                            temp++;
                        }
                    } else {
                        if (dy * ddx == dx * ddy) {
                            temp++;
                        }
                    }
                }
                result = Math.max(result, temp);
//                if (temp >= 15) {
//                    System.out.println("i : " + i + ", j : " + j + ", result = " + temp + ", tempCon = " + tempCon);
//                }
            }
        }
        return result;
    }
}
