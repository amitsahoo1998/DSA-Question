import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(map.getOrDefault(c,0) == 0) return false;
            map.put(c, map.getOrDefault(c,0) - 1);
        }

        for (Map.Entry<Character , Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("rat","car"));
    }
}
