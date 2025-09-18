package day03;

import java.util.*;

public class Backjoon2588 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int b_1 = b/100;
        int b_2 = (b%100)/10;
        int b_3 = (b%10);

        System.out.println(a*b_3);
        System.out.println(a*b_2);
        System.out.println(a*b_1);
        System.out.println(a*b);
    }
}

