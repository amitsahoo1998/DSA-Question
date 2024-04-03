import java.util.ArrayList;
import java.util.List;

public class MiddleOfArray {
    static List<Integer> findMiddleElements(List<Integer> arr) {

        int arrSize = arr.size();
        List<Integer> ans = new ArrayList<>();
        if (arrSize % 2 == 0) {
            ans.add(arr.get(arrSize / 2 - 1));
            ans.add(arr.get(arrSize / 2));
        } else {
            ans.add(arr.get(arrSize / 2));
        }


        return ans;
    }
}
