package leetcode;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        } else if (n == 1) {
            return "1";
        } else {
            StringBuilder result = new StringBuilder();
            result.append("1");
            for (int i = 2; i <= n; i++) {
                char[] arr = result.toString().toCharArray();
                StringBuilder next = new StringBuilder();
                for (int j = 0; j < arr.length; j++) {
                    int count = 1;
                    char c = arr[j];
                    while (j < arr.length - 1 && arr[j] == arr[j + 1]) {
                        count++;
                        j++;
                    }
                    next.append(count);
                    next.append(c);
                }
                result = next;
            }
            return result.toString();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(countAndSay(i));
        }
        // countAndSay(70);
    }
}
