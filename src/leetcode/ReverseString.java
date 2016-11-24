package leetcode;

public class ReverseString {
    public static String reverseString(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        char[] newArr = new char[length];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[length - i - 1];
        }
        return String.valueOf(newArr);
    }

    public static void main(String[] args) {
        String string = "allow";
        System.out.println(ReverseString.reverseString(string));
    }
}
