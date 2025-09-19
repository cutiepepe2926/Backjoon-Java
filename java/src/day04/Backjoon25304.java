package day04;

import java.util.*;

public class Backjoon25304 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int total_price = sc.nextInt();
        int total_quantitiy = sc.nextInt();
        int result = 0;
        for(int i=1;i<=total_quantitiy;i++){
            int each_price = 0;
            int each_quantity = 0;
            each_price = sc.nextInt();
            each_quantity = sc.nextInt();
            result += each_price*each_quantity;
        }
        if(total_price == result){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
