package leetcode;

public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        int dot1 = 0, dot2 = 0;

        dot1 = version1.indexOf('.', dot1);
        dot2 = version2.indexOf('.', dot2);
//        int cur1 = 0, cur2 = 0;
        if (dot1 == -1) {
            dot1 = version1.length();
        }
        if (dot2 == -1) {
            dot2 = version2.length();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("02.1", "2.1"));
    }
}
