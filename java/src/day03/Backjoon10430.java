package day03;

import java.util.Scanner;

import static java.lang.System.exit;

public class Backjoon10430 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<2){
            exit(1);
        }
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(b>10001 || c> 10001){
            exit(1);
        }
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);

    }

}
