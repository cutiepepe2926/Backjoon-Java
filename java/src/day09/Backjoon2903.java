package day09;

import java.io.*;
import java.util.*;

public class Backjoon2903 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        //맨 처음에서 한 변의 점의 개수
        double result = 2.0;
        
        //횟수를 거듭할수록 2+(2^n)만큼 한 변의 개수가 증가
        for(double i=0; i<N;i++){
            result = result + (Math.pow(2.0,i));
        }
        
        //마지막에 제곱으로 네모에 존재하는 점의 개수의 합을 계산
        System.out.println((int)(result*result));
    }
}
