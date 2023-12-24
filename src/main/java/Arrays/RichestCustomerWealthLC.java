package Arrays;


import java.util.ArrayList;
import java.util.List;

public class RichestCustomerWealthLC {

/*     Leet code Question - easy

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the  ith customer has in the j th bank.
 Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
                    */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int[][] a={{1,2,3},{3,2,1,898}};

        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                sum=sum + a[i][j];
            }
            list.add(sum);
        }
      int maxWealth=  list.stream().reduce(0, (b, c) -> b > c ? b : c).intValue();
        System.out.println(maxWealth);
    }
}
