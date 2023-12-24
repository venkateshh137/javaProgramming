package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingSwap {

    private static void reverse(int[] arr) {

        int end=arr.length-1;

        for (int start = 0; start < end; start++) {

            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }

        System.out.println("After Swapping "+ Arrays.toString(arr));
    }


    private static void reverseInRange(int[] arr,int start,int end) {

       //  end=arr.length-1;
        for (; start <=end; start++) {

            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }

        System.out.println("After Swapping "+ Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr= {2,4,5,6,7,9};

        System.out.println("Before Reversing " +Arrays.toString(arr));

        // comment any one of the methods and run
        // because we are passing same arr to both methods

      //  reverse(arr);

        reverseInRange(arr,2,5);


    }






}
