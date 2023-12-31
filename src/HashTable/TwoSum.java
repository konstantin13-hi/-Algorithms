package HashTable;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0 ;i < nums.length ; i++){

            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};

            }
            hashMap.put(nums[i],i);

        }

      return null;
    }

    public static void main(String[] args) {
        int [] array = new int[]{2,1,11,1};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));

    }
}
