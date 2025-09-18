package day03;

import java.util.Scanner;

import static java.lang.System.exit;

public class Backjoon1008 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double A = scan.nextInt();
        if(A<0){
            exit(1);
        }
        double B = scan.nextInt();
        if(B>10){
            exit(1);
        }
        System.out.println(A/B);

    }
}
