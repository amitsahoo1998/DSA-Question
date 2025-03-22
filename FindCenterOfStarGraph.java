import java.util.HashMap;
import java.util.Map;

public class FindCenterOfStarGraph {


    public static int findCenter(int[][] edges) {

        HashMap<Integer,Integer> map = new HashMap<>();

        var highestFrequency = 0;
        var ans = 0;

        for(int[] arr : edges){
            for(int i : arr){
                map.put(i, map.getOrDefault(i , 0)+1 );
            }
        }

        for (Map.Entry<Integer , Integer> set : map.entrySet()){
            if (highestFrequency < set.getValue()){
                highestFrequency = set.getValue();
                ans = set.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        var edges = new int[][]{{1,2},{5,1},{1,3},{1,4}};

        System.out.println(FindCenterOfStarGraph.findCenter(edges));
    }
}
