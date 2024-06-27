import java.util.ArrayList;
import java.util.List;

class Palindrome {
    static int isPalindrome(String s) {
        // code here

        char[] arr = s.toCharArray();
        StringBuilder reversedString = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString.append(arr[i]);
        }

        if (reversedString.toString().equals(s)) {
            return 1;
        }
        return 0;
    }

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }

    public boolean isPalindrome2(int x){
        if (x<0) return false;

        int reversed = 0;
        int temp = x;

        while (temp != 0){
            int digit = temp%10;
            reversed = reversed*10 + digit;
            temp /= 10;
        }

        return reversed == x;
    }

}