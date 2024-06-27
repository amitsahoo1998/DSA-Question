import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class HalvesAreAlike {
    private static boolean halvesAreAlike(String s) {

        int n = s.length();
        int half = n / 2;

        String a = s.substring(0, half);
        String b = s.substring(half,n);

        int vowelIna = countVowels(a);
        int vowelInb = countVowels(b);

        return vowelIna == vowelInb;
    }

    private static int countVowels(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)){
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        System.out.println("aeiouAEIOU".indexOf(c));
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("bookingo"));
        System.out.println(isVowel('c'));
    }
}
