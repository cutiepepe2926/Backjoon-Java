package day03;

import java.util.Scanner;

public class Backjoon18108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if(1000<=year && year<=3000){
            System.out.printf("%d",year-543);
        } else {
            System.out.println("error");
        }
    }
}
