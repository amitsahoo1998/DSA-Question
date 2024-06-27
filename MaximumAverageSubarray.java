public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int n = nums.length;
        for (int i : nums){
            sum += i;
        }
        return sum/k;
    }

    public static void main(String[] args) {

    }
}
