package day06;

import java.io.*;
import java.util.*;

public class Backjoon2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            if(i<N-1){
                for(int j=1;j<N-i;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<2*i+1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(i==N-1){
                for(int j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int i=N; i>1; i--){
            for(int j=1;j<)
        }
    }
}
