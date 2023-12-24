package Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenNoOfDigitsInArray {


    public static int countEvenDigits(int arr[]){

        int evenCount=0;

        for (int i = 0; i < arr.length; i++) {

           if(countNoOfdigits(arr[i]) % 2 == 0) {

               evenCount ++;
           }

        }
        return evenCount;
    }

    public static int countNoOfdigits(int num){

        if(num < 0){

            num= num * -1;

        }

        if(num == 0){

            return 1;

        }

        int count=0;

        while(num > 0){

            num= num /10;

            count++;

        }
       return count;

    }


    public static int countEvenDigitsStream(int[] arr){

     return   Arrays.stream(arr)
                .boxed()
                .map(n -> {
                    if( n < 0)
                    {
                        n= n * -1;
                    }
                    return n;
                })
                .map(String::valueOf)
                .filter(s -> s.length() % 2 == 0)
                .toList()
                .size();
    }



    public static void main(String[] args) {

        System.out.println(countEvenDigits(new int[]{120, 345, -20, 600,-890, 78960}));

        System.out.println(countEvenDigitsStream(new int[]{20, -34, -20,90, 7896}));


        // Easy way to find the count of digits in a given number

       int count= (int)Math.log10(7896) + 1;
        System.out.println(count);

    }
}
