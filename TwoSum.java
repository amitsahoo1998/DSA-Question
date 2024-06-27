import jdk.dynalink.linker.LinkerServices;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSumHashmap(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i< nums.length; i++){
            int compliment = target - nums[i];

            if (map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }

            map.put(nums[i],i);
        }
        return new int[]{};
    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1 ; j<nums.length-1 ; j++){
                if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = i;
                    break;
                }
            }
        }
        return result;
    }
}
