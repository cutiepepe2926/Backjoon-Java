package day04;

import java.util.*;

public class Backjoon25314 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(4 <= N && N <= 1000 && N%4==0 ){
            for(int i=1;i<=(N/4);i++){
                System.out.print("long ");
            }
            System.out.println("int");
        }
    }
}
