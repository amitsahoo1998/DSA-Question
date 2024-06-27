import java.util.HashMap;

public class MajorityElement {



    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int highestFrequency = 0;
        int result = 0;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > highestFrequency){
                highestFrequency = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }

}
