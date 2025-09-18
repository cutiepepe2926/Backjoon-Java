package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N과 M을 입력 : ");
        int N = scan.nextInt();
        int M = scan.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = i+1;
        }

        for(int j=0;j<M;j++){
            System.out.print("i와 j를 입력 : ");
            int q = scan.nextInt();
            if(q<=0||q>N){
                System.out.println("범위 내의 값을 입력하세요.");
                break;
            }
            int k = scan.nextInt();
            if(k<=0||k>N){
                System.out.println("범위 내의 값을 입력하세요.");
                break;
            }

            int temp = arr[q-1];
            arr[q-1] = arr[k-1];
            arr[k-1] = temp;
        }

        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
