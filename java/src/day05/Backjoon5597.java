package day05;

import java.util.*;
import java.io.*;

public class Backjoon5597 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 28;
        int arr[] = new int[30];

        for(int i = 0; i < 30; i++){
            arr[i] = i+1;
        }

        int target = 0;

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            target = Integer.parseInt(st.nextToken());
            arr[target-1] = 0;
        }

        Arrays.sort(arr);
        bw.write(arr[28]+"\n");
        bw.write(arr[29]+"\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
