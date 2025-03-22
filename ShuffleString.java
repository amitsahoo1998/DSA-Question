import java.util.HashMap;
import java.util.TreeMap;

public class ShuffleString {

    public static String restoreString(String s, int[] indices){
        var hashmap = new HashMap<Integer,Character>();

        char[] charS = s.toCharArray();

        for(int i=0; i<indices.length; i++){
            hashmap.put(indices[i] , charS[i]);
        }

        StringBuilder res = new StringBuilder();

        for(int i=0; i<indices.length; i++){
            res.append(hashmap.get(i));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        var s = "codeleet";
        var indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s,indices));
    }
}
