import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {

    static void reverseArrayExtraArray(int[] arr) {

        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        System.out.print("Reversed Array: ");
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }

    static void reverseArrayLoop(int[] arr, int start, int end) {
        int temp ;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void arrayReverseRecursion(int[] arr , int start , int end) {
        int temp;
        if (start > end) return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        arrayReverseRecursion(arr, start + 1, end-1);
    }

    static void reverseArrayUsingStack(int[]arr){
        Stack<Integer> stack = new Stack<>();

        for (int eliminate : arr) {
            stack.push(eliminate);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }

    static String reverseANumber(int n){
        String number = String.valueOf(n);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = number.length()-1 ; i>=0 ; i--){
            stringBuilder.append(number.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        printArray(arr);
        System.out.println();
        reverseArrayLoop(arr,0,arr.length-1);
        printArray(arr);
        System.out.println();
        arrayReverseRecursion(arr, 0, arr.length-1);
        printArray(arr);
        System.out.println();
        reverseArrayUsingStack(arr);
        printArray(arr);
        System.out.println();
        System.out.println(reverseANumber(20));
    }
}
