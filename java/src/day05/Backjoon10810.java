package day05;

import java.io.*;
import java.util.*;

public class Backjoon10810 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i]= 0;
        }
        for(int i = 0; i < M; i++){
            String s2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(s2);

            int start = Integer.parseInt(st2.nextToken());
            int stop = Integer.parseInt(st2.nextToken());
            int ball = Integer.parseInt(st2.nextToken());
            for(int j = start-1; j < stop; j++){
                arr[j] = ball;
            }
        }
        for(int i = 0; i < N; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
