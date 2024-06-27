import kotlin.Pair;

import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindErrorNums {

    /**
     * Example 1:
     * Input: nums = [1,2,2,4]
     * Output: [2,3]
     * Example 2:
     * Input: nums = [1,1]
     * Output: [1,2]
     * @param nums
     * @return
     */

    public static int[] findErrorNums(int[] nums) {

        int n = nums.length;

        int sum = 0;
        int totalSum = (n * (n+1))/2;

        int missingNo = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< n ; i++){
            if (set.contains(nums[i])){
                missingNo = nums[i];
            }
            set.add(nums[i]);
        }
        for (int i : set) {
            sum += i;
        }

        return new int[]{ missingNo, totalSum-sum};
    }


    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
