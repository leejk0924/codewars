package algoMaster.twopoint;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = nums1.length - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }

            else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while(p2 >= 0) nums1[p--] = nums2[p2--];
    }

    public static void main(String[] args) {
        var test = new MergeSortedArray();
        var ints = new int[]{1,2,3,0,0,0};
        test.merge(ints, 3, new int[]{2,5,6}, 3 );
        Arrays.stream(ints).forEach(System.out::println);
    }
}
