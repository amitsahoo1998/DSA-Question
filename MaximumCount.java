public class MaximumCount {

    public int maximumCount(int[] nums) {
        int n = nums.length;
        int firstNonNegative = binarySearch(nums , 0);
        int firstPositive = binarySearch(nums,1);

        return Math.max(firstNonNegative, firstPositive);
    }

    private int binarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = low +(high - low) / 2;

            if(nums[mid] >= target){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        var nums = new int[]{-3,-2,-1,0,0,1,2};
        System.out.println(new MaximumCount().maximumCount(nums));
    }
}
