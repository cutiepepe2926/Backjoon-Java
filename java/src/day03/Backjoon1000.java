package day03;

import java.util.Scanner;

import static java.lang.System.exit;

public class Backjoon1000 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        if(A<0){
            exit(1);
        }
        int B = scan.nextInt();
        if(B>10){
            exit(1);
        }
        System.out.println(A+B);

    }
}
