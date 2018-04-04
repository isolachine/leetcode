/**
 * 
 */
package leetcode;

/**
 * @author Isolachine
 *
 */
public class SimilarRGBColor {
    static int[] shortHand = { 0x00, 0x11, 0x22, 0x33, 0x44, 0x55, 0x66, 0x77, 0x88, 0x99, 0xaa, 0xbb, 0xcc, 0xdd, 0xee, 0xff };

    public String similarRGB(String color) {
        String result = "#";
        for (int i = 1; i < 7; i += 2) {
            int rgb = Integer.parseInt(color.substring(i, i + 2), 16);
            if (rgb % 17 <= 8) {
                rgb = rgb / 17 * 17;
            } else {
                rgb = (rgb / 17 + 1) * 17;
            }
            if (rgb == 0) {
                result += "00";
            } else {
                result += Integer.toHexString(rgb);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (int s : shortHand) {
            System.out.println(Integer.toHexString(s));
        }
        System.out.println(new SimilarRGBColor().similarRGB("#00ff00"));
    }
}
