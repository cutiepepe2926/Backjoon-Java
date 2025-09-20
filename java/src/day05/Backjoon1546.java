package day05;

import java.util.*;
import java.io.*;

public class Backjoon1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        float arr[] = new float[N];
        float highscore = 0;
        for(int i=0;i<N;i++){
            arr[i] = Float.parseFloat(st.nextToken());
            if(highscore<arr[i]){
                highscore = arr[i];
            }
        }

        float result = 0;
        for(int i=0;i<N;i++){
            result += arr[i]/highscore*100;
        }
        System.out.println(result/N);
    }
}
