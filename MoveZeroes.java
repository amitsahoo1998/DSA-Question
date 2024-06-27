public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[lastNonZeroFoundAt] = nums[i];
            lastNonZeroFoundAt++;
        }

        for(int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }

    }


    public static void main(String[] args) {

    }
}
