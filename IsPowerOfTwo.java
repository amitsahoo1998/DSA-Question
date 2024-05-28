public class IsPowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        double squire = 0;
        int power = 0;
        while(squire < n) {
            squire = Math.pow(2,power);
            if(squire == n){
                return true;
            }
            power++;
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
