import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInAnArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Map<Integer, Integer> mpp = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() > 1) {
                res.add(entry.getKey());
            }
        }

        if (res.isEmpty()) {
            res.add(-1);
        } else {
            Collections.sort(res); // Sort the list of duplicates
        }

        return res;
    }
}
