package day03;

import java.util.*;

public class Backjoon2525 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( 0<=a && a<= 23 && 0<= b && b <= 59 && 0<= c && c <= 1000 ){
            if(b+c>=60){
                int add_a = (b+c)/60;
                int add_b = (b+c)%60;
                if(a+add_a>=24){
                    System.out.println(((a+add_a)%24)+" "+add_b);
                }
                else {
                    System.out.println((a+add_a)+" "+add_b);
                }
            }
            else {
                System.out.println(a+" "+(b+c));
            }
        }
    }
}
