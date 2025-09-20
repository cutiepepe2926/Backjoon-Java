package day05;

import java.util.*;
import java.io.*;

public class Backjoon2562 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 9;
        String s;
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            arr[i] =  Integer.parseInt(st.nextToken());
        }

        int pos = 0;
        int max = 0;
        for(int i = 0; i < N; i++){
            if(max<arr[i]){
                max = arr[i];
                pos = i+1;
            }
        }
        bw.write(max+"\n");
        bw.write(pos+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
