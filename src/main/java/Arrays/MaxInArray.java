package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) {

        int[] arr= {2,4,11,5,6,7,9};
        System.out.println(Arrays.toString(arr));
        int max=0;

        for (int i = 0; i < arr.length; i++) {

            if( arr[i] > max){
                max=arr[i];
            }
        }

        System.out.println("Max value " + max);
    }


}
