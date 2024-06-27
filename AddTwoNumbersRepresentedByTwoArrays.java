public class AddTwoNumbersRepresentedByTwoArrays {
    static String calc_Sum(int a[], int n, int b[], int m) {
        // Complete the function
        int i = n-1;
        int j = m-1;
        int ans=0;
        int carry=0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // Initialize sum with carry
            // Add the digits if they exist
            if (i >= 0){
                sum += a[i];
            }

            if (j >= 0) {
                sum += b[j];
            }

            carry = sum / 10; // Update carry
            ans = ans * 10 + sum % 10; // Update ans with the least significant digit


            // Decrement indices
            if (i >= 0) {
                i--;
            }

            if (j >= 0) {
                j--;
            }
        }

        return String.valueOf(ans);
    }
}
