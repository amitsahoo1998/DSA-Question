import java.util.Arrays;

public class MinMaxFinder {

    static int setMini(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }

    static int setMaxi(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    static void minMax(int[] arr, int n) {

        Arrays.sort(arr);

        System.out.println("minimum value of array is " + arr[0]);
        System.out.println("maximum value of array is " + arr[n - 1]);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(setMini(arr, arr.length));
        System.out.println(setMaxi(arr, arr.length));
        minMax(arr, arr.length);
    }
}
