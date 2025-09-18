package day03;

import java.util.*;

public class Backjoon2480 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int list[] = {a,b,c};
        Arrays.sort(list);

        if(a == b && b == c){
            System.out.println(10000+a*1000);
        }
        else if(a == b ^ b == c ^ a == c){
            System.out.println(1000+((a==b)?a:c)*100);
        }
        else {
            System.out.println(list[2]*100);
        }
    }
}
