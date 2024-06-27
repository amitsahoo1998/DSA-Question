import java.util.HashMap;
import java.util.Map;

public class IdenticalTwins {

    public static void main(String[] args) {

        int[]arr = {1, 2, 3, 2, 1};

        System.out.println(getIdenticalTwinsCountHashMap(arr));
    }

    int getIdenticalTwinsCount (int[] arr) {
        // add your logic here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

    static int getIdenticalTwinsCountHashMap (int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer val = frequency.get(arr[i]);
            if(val == null) {
                frequency.put(arr[i], 1);
            } else {
                frequency.put(arr[i], ++val);
            }
        }
        int identicalTwinCount = 0;
        for (Map.Entry<Integer, Integer> x: frequency.entrySet()) {
            identicalTwinCount += (x.getValue() * (x.getValue() - 1)) / 2;
        }
        return identicalTwinCount;
    }
}
