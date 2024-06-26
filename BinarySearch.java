public class BinarySearch {

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1 , mid , ans;

        while(start<=end){
            mid = start + (end - start) / 2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] > target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,3,5,9,12};

        new BinarySearch().search(arr , 9);
    }


}
