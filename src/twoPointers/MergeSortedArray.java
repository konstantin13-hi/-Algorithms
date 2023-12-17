package twoPointers;

import java.util.Arrays;

public class MergeSortedArray {

    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] newArr = new int[n+m];
        int pointerN = 0;
        int poinerM = 0;

        for (int i=0 ;i<n+m;i++){
            if (poinerM <m && pointerN < n){
                newArr[i] =  nums1[poinerM] > nums2[pointerN] ? nums2[pointerN++] : nums1[poinerM++];
            }
            else if (poinerM <m){
                newArr[i] = nums1[poinerM++];
            }
            else if (pointerN < n){
                newArr[i] = nums2[pointerN++];
            }

        }

        for (int i = 0 ; i<n+m;i++){
            nums1[i] = newArr[i];
        }

    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        for (int i =n+m -1 ; i>=0; i--){
            if (0 <m && 0 < n){
                nums1[i] =  nums1[m-1] > nums2[n-1] ?  nums1[m-- - 1] : nums2[n-- - 1];
            }
            else if (0 <m){
                nums1[i] = nums1[m-- - 1];
            }
            else if (0 < n){
                nums1[i] = nums2[n-- - 1];
            }

        }

    }

    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,3,4,5,6,0,0,0};
        int m = 6;
        int [] nums2 = new int[]{2,5,6} ;
        int n = 3;
        merge2(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));


    }
}
