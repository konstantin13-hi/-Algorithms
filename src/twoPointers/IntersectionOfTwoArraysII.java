package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int pointer = 0;
        int poniterSecond = 0;
        for (int i =0 ; i< nums1.length + nums2.length ; i++){
            if(pointer <=nums1.length-1 && poniterSecond <= nums2.length -1) {
                if (nums1[pointer] == nums2[poniterSecond]) {
                    list.add(nums1[pointer]);
                    pointer++;
                    poniterSecond++;
                } else {
                   if (nums1[pointer]>nums2[poniterSecond]){
                       poniterSecond++;
                   }
                   else {
                       pointer++;
                   }

                }
            }

        }




        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer = 0;
        int poniterSecond = 0;
        for (int i =0 ; i< nums1.length + nums2.length ; i++){
            if(pointer <=nums1.length-1 && poniterSecond <= nums2.length -1) {
                if (nums1[pointer] == nums2[poniterSecond]) {
                    list.add(nums1[pointer]);
                    pointer++;
                    poniterSecond++;
                } else {
                    if (nums1[pointer]>nums2[poniterSecond]){
                        poniterSecond++;
                    }
                    else {
                        pointer++;
                    }

                }
            }
            else {
                break;
            }

        }
        int [] result = new int[list.size()];
        for (int i=0;i<list.size();i++){
            result[i]= list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,2,1};
        int [] nums2 = new int[]{2,2};
         nums1 = new int[]{4, 9, 5};
         nums2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }
}
