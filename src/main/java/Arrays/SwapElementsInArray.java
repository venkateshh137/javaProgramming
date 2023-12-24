package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElementsInArray {
    private static void swap(int[] arr, int index1, int index2) {

          int temp= arr[index1];
           arr[index1] = arr[index2];
           arr[index2] = temp;

        System.out.println("After Swapping "+Arrays.toString(arr));
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter index1 : ");
        int index1=sc.nextInt();
        System.out.println("Enter index2 : ");
        int index2=sc.nextInt();

        int[] arr= {2,4,5,6,7,9};

        System.out.println("Before Swapping " +Arrays.toString(arr));


        swap(arr,index1,index2);


    }

}
