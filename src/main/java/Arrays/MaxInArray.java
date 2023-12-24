package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {

    public static int maxInArray(int[] arr){

        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if( arr[i] > max){
                max=arr[i];
            }
        }

        return max;
    }

    public static int maxInArrayRange(int[] arr,int start,int end){

        if(arr.length ==0 || arr == null)
            return -1;

        int max=Integer.MIN_VALUE;

        for (int i = start; i <=end; i++) {

            if( arr[i] > max){
                max=arr[i];
            }
        }

        return max;
    }



    public static void main(String[] args) {

        int[] arr= {2,4,11,5,6,7,9};

        System.out.println(Arrays.toString(arr));

        System.out.println("Max value: " +  maxInArray(arr));


        //maxInArrayRange

        System.out.println("Max value In Range: " +  maxInArrayRange(arr,0,2));


    }


}
