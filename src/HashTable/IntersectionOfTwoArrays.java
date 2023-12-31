package HashTable;

import LinkedList.RemoveDuplicatesfromSortedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map map = new HashMap<>();
        for (int i = 0; i<nums1.length ; i++){
                map.put(nums1[i],1);

        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=0 ;i<nums2.length;i++){
            if (map.containsKey(nums2[i])){
                linkedList.add(nums2[i]);
                map.remove(nums2[i]);
            }

        }
        return linkedList.stream().mapToInt(Integer::intValue).toArray();

    }


    public static void main(String[] args) {
        int [] num1 = new int[]{4,9,5};
        int [] num2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(num1, num2)));

    }
}
