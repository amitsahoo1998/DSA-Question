import java.util.ArrayList;
import java.util.List;

class Palindrome {
    static int isPalindrome(String s) {
        // code here

        char[]arr = s.toCharArray();
        StringBuilder reversedString = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString.append(arr[i]);
        }

        if (reversedString.toString().equals(s)){
            return 1;
        }
        return 0;
    }
}