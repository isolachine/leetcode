package leetcode;

import net.sf.json.JSONArray;

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

    public static void main(String[] args) {
        String string = "[[40,-23],[9,138],[429,115],[50,-17],[-3,80],[-10,33],[5,-21],[-3,80],[-6,-65],[-18,26],[-6,-65],[5,72],[0,77],[-9,86],[10,-2],[-8,85],[21,130],[18,-6],[-18,26],[-1,-15],[10,-2],[8,69],[-4,63],[0,3],[-4,40],[-7,84],[-8,7],[30,154],[16,-5],[6,90],[18,-6],[5,77],[-4,77],[7,-13],[-1,-45],[16,-5],[-9,86],[-16,11],[-7,84],[1,76],[3,77],[10,67],[1,-37],[-10,-81],[4,-11],[-20,13],[-10,77],[6,-17],[-27,2],[-10,-81],[10,-1],[-9,1],[-8,43],[2,2],[2,-21],[3,82],[8,-1],[10,-1],[-9,1],[-12,42],[16,-5],[-5,-61],[20,-7],[9,-35],[10,6],[12,106],[5,-21],[-5,82],[6,71],[-15,34],[-10,87],[-14,-12],[12,106],[-5,82],[-46,-45],[-4,63],[16,-5],[4,1],[-3,-53],[0,-17],[9,98],[-18,26],[-9,86],[2,77],[-2,-49],[1,76],[-3,-38],[-8,7],[-17,-37],[5,72],[10,-37],[-4,-57],[-3,-53],[3,74],[-3,-11],[-8,7],[1,88],[-12,42],[1,-37],[2,77],[-6,77],[5,72],[-4,-57],[-18,-33],[-12,42],[-9,86],[2,77],[-8,77],[-3,77],[9,-42],[16,41],[-29,-37],[0,-41],[-21,18],[-27,-34],[0,77],[3,74],[-7,-69],[-21,18],[27,146],[-20,13],[21,130],[-6,-65],[14,-4],[0,3],[9,-5],[6,-29],[-2,73],[-1,-15],[1,76],[-4,77],[6,-29]]";
        JSONArray jsonArray = JSONArray.fromObject(string);
        Point[] points = new Point[jsonArray.size()];
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONArray point = (JSONArray)jsonArray.get(i);
            points[i] = new Point(point.getInt(0), point.getInt(1));
        }
        // points[0] = new Point(0, 0);
        // points[1] = new Point(-77, 1);
        // points[2] = new Point(77, -1);
        // points[3] = new Point(6, 4);
        // points[4] = new Point(3, 3);
        // points[5] = new Point(5, 6);
        // points[3] = new Point(4, 4);
        // points[4] = new Point(5, 5);
        // points[5] = new Point(5, 8);
        // points[6] = new Point(5, 9);
        // points[7] = new Point(4, 8);
        // points[8] = new Point(4, 9);
        // points[9] = new Point(5, 10);
//        System.out.println(points[34].x + "," + points[34].y);
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i].x == - points[i].y + 77) {
                System.out.println(i + " : " + points[i].x + " : " + points[i].y);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(maxPoints(points));
    }
}
