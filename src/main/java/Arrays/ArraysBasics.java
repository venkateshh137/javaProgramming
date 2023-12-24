package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysBasics {


    public static void main(String[] args) {

        // 1Dimensional Array
        int[] arr = {1, 2};

        int[] arr2 = new int[2];
        arr2[0] = 1;

        // length -- function
        System.out.println(arr.length);

        // arr[3] --> IndexOutOfBoundException


        System.out.println(Arrays.toString(arr));

        String[] names = {"Ayyappa", "venkatesh", "Prasana"};

        names[0] = "Raju";

        for (String name : names) {
            System.out.println(name);
        }

        // 2Dimensional Array
        int[][] b = {
                {1, 2, 3},
                {4, 5, 6, 7, 8},
                {6, 7, 8}
        };

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println(" ");

        }

        for (int[] b1 : b) {
            System.out.println(Arrays.toString(b1));

        }

        // ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

        list.set(0, 90);

        list.remove(0);


        list.add(1);

        System.out.println(list);

        System.out.println(list.get(0));


        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            lists.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lists.get(i).add(1);
            }
        }


        System.out.println(lists);
    }
}
