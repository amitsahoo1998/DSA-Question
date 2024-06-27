import java.util.HashSet;

public class AppendCharacters {

    public int appendCharacters(String s, String t) {

        int i = 0, j = 0, m=s.length(), n=t.length();

        while (i < m && j < n){
            if (s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }

        return n-j;
    }

    public static void main(String[] args) {
        String s = "coaching", t = "coding";
        System.out.println(new AppendCharacters().appendCharacters(s, t));
    }
}
