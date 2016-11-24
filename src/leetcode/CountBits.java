package leetcode;

import java.util.Arrays;

public class CountBits {
    public static int[] countBits(int num) {
        int[] arr = new int[num + 1];
        int count = 0;
        int testNum = 1;
        while (testNum <= num) {
            testNum = testNum * 2;
            count++;
        }
        if (num < 4) {
            for (int i = 0; i < num + 1; i++) {
                if (i == 3) {
                    arr[i] = 2;
                } else if (i == 2) {
                    arr[i] = 1;
                } else if (i == 1) {
                    arr[i] = 1;
                } else if (i == 0) {
                    arr[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (i == 3) {
                    arr[i] = 2;
                } else if (i == 2) {
                    arr[i] = 1;
                } else if (i == 1) {
                    arr[i] = 1;
                } else if (i == 0) {
                    arr[i] = 0;
                }
            }
        }

        int tempCount = 2;
        for (int i = 2; i < count; i++) {
            int[] newArr = Arrays.copyOfRange(arr, tempCount, tempCount * 2);
            tempCount = tempCount * 2;
            if (num >= tempCount + newArr.length * 2) {
                for (int j = 0; j < newArr.length; j++) {
                    arr[tempCount + j] = newArr[j];
                    arr[tempCount + j + newArr.length] = newArr[j] + 1;
                }
            } else if (num < tempCount + newArr.length * 2 && num >= tempCount + newArr.length) {
                for (int j = 0; j < newArr.length; j++) {
                    arr[tempCount + j] = newArr[j];
                    if (tempCount + j + newArr.length <= num) {
                        arr[tempCount + j + newArr.length] = newArr[j] + 1;
                    }
                }
            } else if (num < tempCount + newArr.length && num >= tempCount) {
                for (int j = 0; j < newArr.length; j++) {
                    if (tempCount + j <= num) {
                        arr[tempCount + j] = newArr[j];
                    }
                }
            }
//            for (int j = 0; j < newArr.length; j++) {
//                if (tempCount + j <= num) {
//                    arr[tempCount + j] = newArr[j];
//                }
//                if (tempCount + j + newArr.length <= num) {
//                    arr[tempCount + j + newArr.length] = newArr[j] + 1;
//                }
//            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(100)));
    }

}
