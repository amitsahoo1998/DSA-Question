import java.util.ArrayList;

public class LongestNiceSubarray {

    public static void main(String[] args) {
        var nums=new int[]{744437702,379056602,145555074,392756761,560864007,934981918,113312475,1090,16384,33,217313281,117883195,978927664};
        System.out.println(longestNiceSubarray(nums));
    }
    public static int longestNiceSubarray(int[] nums) {
        int maxLength = 1; // Track the maximum nice subarray length found

        for (int start = 0; start < nums.length - maxLength; start++) {
            int currentLength = 1; // Length of current nice subarray
            int usedBits = nums[start]; // Track which bits are used in our subarray

            // Try to extend the subarray
            for (int end = start + 1; end < nums.length; end++) {
                // If no bits overlap between current number and used bits, we can extend
                if ((usedBits & nums[end]) == 0) {
                    usedBits |= nums[end]; // Add new number's bits to our tracker
                    currentLength++;
                }
                // If bits overlap, this number can't be part of our nice subarray
                else break;
            }

            // Update max length if we found a longer nice subarray
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
