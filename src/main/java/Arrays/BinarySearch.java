package Arrays;

public class BinarySearch {
    public static int BinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static int OrderAgnosticBinarySearch(int[] arr, int target) {
        // check the array is in which sorting order.
        boolean isAsc = false;
        if (arr[0] < arr[arr.length - 1]) {
            isAsc = true;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        // Array is sorted in ascending order what if we dont know array is sorted or not?? -- Acoustic Binary Search.
        System.out.println(BinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 50}, 50));

        System.out.println(OrderAgnosticBinarySearch(new int[]{50,8,7,6,5,4,3,2,1}, 7));

        System.out.println(OrderAgnosticBinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 50}, 50));

    }
}