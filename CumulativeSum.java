import java.util.ArrayList;
import java.util.List;

public class CumulativeSum {

    int[] getCumulativeSum(int[] arr) {

        int sum = 0;
        int[] cumulativeSum = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            cumulativeSum[i] = sum;
        }
        return cumulativeSum;
    }

    List<Integer> getPositiveCumulativeSum(int[] arr) {
        int sum = 0;
        List<Integer> cumulativeSum = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 0) {
                cumulativeSum.add(sum);
            }
        }

        return cumulativeSum;
    }


    public static void main(String[] args) {

    }
}
