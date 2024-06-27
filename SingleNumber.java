import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {


    public int[] singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] findSingleNumbers(int[] nums) {
        // Step 1: XOR all elements to get the XOR of the two single numbers
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }

        // Step 2: Find any set bit in the XOR result
        // This can be any set bit, so we'll choose the rightmost set bit
        int rightmostSetBit = xorResult & -xorResult;

        // Step 3: Divide the elements into two groups based on the set bit
        int group1 = 0, group2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                group1 ^= num;
            } else {
                group2 ^= num;
            }
        }

        // Step 4: Return the two elements found
        return new int[]{group1, group2};
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();

        int[] nums = new int[]{1,2,1,3,2,5};

        int[] result = singleNumber.findSingleNumbers(nums);
        System.out.println(Arrays.toString(result));
    }
}
