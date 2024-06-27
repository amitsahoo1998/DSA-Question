import java.util.HashSet;

public class IndexOfAnExtraElement {
    static int missingNumber(int array[], int n) {
        // Your Code Here

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i< array.length ; i++){
            set.add(array[i]);
        }
        for (int i = 0 ; i<=n ; i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
