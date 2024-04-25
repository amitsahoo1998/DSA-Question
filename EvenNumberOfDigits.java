import java.util.ArrayList;
import java.util.List;

public class EvenNumberOfDigits {

    public static int countDigit(int num){
        int count = 0;
        while( num != 0){
            num /= 10;
            count++;
        }
        return count;
    }


    public static List<Integer> getEvenDigitNumbers (int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i : arr){
            if (countDigit(i) % 2 == 0){
                result.add(i);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[]arr = {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};

        System.out.println(getEvenDigitNumbers(arr));
    }
}
