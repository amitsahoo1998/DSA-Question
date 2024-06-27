import java.util.HashSet;

public class MissingNumber {
    static int missingNumber(int array[], int n) {
        // Your Code Here

        HashSet<Integer> set = new HashSet<>();

        for (int j : array) {
            set.add(j);
        }
        for (int i = 1 ; i<=n ; i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    static int missingNumberOfArray(int array [], int n){

        int sum = n*(n+1)/2;
        int arraySum = 0;
        for(int i : array){
            arraySum = arraySum+i;
        }
        return sum-arraySum;
    }
}
