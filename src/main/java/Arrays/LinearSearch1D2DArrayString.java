package Arrays;

import java.util.Arrays;

public class LinearSearch1D2DArrayString {


    public static int linearSearch(int[] arr, int target) {

        //   int result = 0;
        if (arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static int[] linearSearch2D(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] == target){

                    return new int[]{i,j};
                }

            }

        }
        return new int[]{-1};
    }

    public static boolean linearSearchString(String s, String target) {

        if(s.isEmpty())
            return false;

        for (String a : s.split("")) {
            if( a.equals(target)){
                return true;
            }


        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(linearSearch(new int[]{18,12,9,14,77,50}, 50));

        System.out.println(linearSearch(new int[]{}, 9));

        System.out.println(Arrays.toString(linearSearch2D(new int[][]{
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 13}
        }, 13)));

        System.out.println(Arrays.toString(linearSearch2D(new int[][]{}, 34)));

        System.out.println(linearSearchString("venkatesh", "i"));
        System.out.println(linearSearchString("", "n"));

    }
}
