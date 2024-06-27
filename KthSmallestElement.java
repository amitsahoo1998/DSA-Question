import java.util.PriorityQueue;

public class KthSmallestElement {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low ; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static int quickSelect(int[] arr, int low, int high , int k) {
        if (low < high) {
            int pi = partition(arr, low, high);
            if (pi == k) {
                return arr[pi];
            } else if (pi < k) {
                return quickSelect(arr, pi+1, high, k);
            }else {
                return quickSelect(arr, low, pi-1, k);
            }
        }
        return -1;
    }

    public static int kthSmallest(int[] arr , int l , int r , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = l ; i < r ; i++){
            pq.offer(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[] arr = {7 ,10 ,4 ,20 ,15};

        int result = kthSmallest(arr, 0, arr.length, 4);
        System.out.println(result);
    }
}
