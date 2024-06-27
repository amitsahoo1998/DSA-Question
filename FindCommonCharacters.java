import java.util.*;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {

        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        Arrays.sort(words);



        for (String word : words) {

            int[] charCount = new int[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(1,6));
    }
}
