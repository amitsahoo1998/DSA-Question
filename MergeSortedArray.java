import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        for(int i=0; i< nums1.length; i++){
            if(nums1[i] != 0){
                result[i] = nums1[i];
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(nums2[i] != 0){
                result[m+i] = nums2[i];
            }
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}
