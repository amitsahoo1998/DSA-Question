import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //01
        System.out.println(ReverseAString.reverseWord("ABCDE"));

        //02
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(MiddleOfArray.findMiddleElements(arr));

        //03
        int [] list = new int[]{12, 15, 18, 63, 85, 121, 25, 45, 36};
        System.out.println(LargestElementInArray.largest(list,list.length));
        //04
        System.out.println(SearchElementInArray.search(list ,list.length,45));
        System.out.println(Palindrome.isPalindrome("ABB"));

        ReverseArray.reverseArrayExtraArray(list);
    }
}
