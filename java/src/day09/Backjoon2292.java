package day09;

import java.io.*;
import java.util.*;

public class Backjoon2292 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //int check = 1;
        int check = 1;
        int result = 1;
        for(int i=1;i<=N;i++){
            check += (6*i-6);
            if(check>N){
                break;
            }
            else if(i==1){
                continue;
            }
            else {
                result++;
            }
        }
        System.out.println(result);

/*
1 + (6*i - 6)
1 -> 1
1 + 6(12-6) = 7 -> 2
1 + 6 + 12(18-6) = 19 -> 3
1 + 6 + 12 + 18(24-6) = 37 -> 4
1 + 6 + 12 + 18 + 24(30-6) = 61 -> 5
1 + 6 + 12 + 18 + 24 + 30(36-6) = 91 -> 6

result = 0
result = result + 1
result = result +

N - 1
6 12 18 24 30
*/
    }
}
