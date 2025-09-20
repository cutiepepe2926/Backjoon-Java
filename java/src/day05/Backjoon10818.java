package day05;

import java.io.*;
import java.util.*;

public class Backjoon10818 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        String s2 = br.readLine();
        int max = -1000000;
        int min = 1000000;
        StringTokenizer st2 = new StringTokenizer(s2);

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
            if(max < arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        bw.write(min+" "+max);
        bw.flush();
        br.close();
        bw.close();
    }
}
