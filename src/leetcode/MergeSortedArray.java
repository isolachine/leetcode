package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list1.add(nums2[i]);
        }
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            nums1[i] = list1.get(i);
        }
    }
    
    public static void mergeGood(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        while (m > 0 && n > 0) {
            nums1[--k] = (nums1[m-1] > nums2[n-1])?nums1[--m]:nums2[--n];
        }
        while (m > 0) {
            nums1[--k] = nums1[--m];
        }
        while (n > 0) {
            nums1[--k] = nums2[--n];
        }
    }
}
