package day05;

import java.io.*;
import java.util.*;

public class Backjoon10871 {

    public static void main(String args[]) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        String s2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s2);

        int arr[] = new int[N];

        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
            if(arr[i]<X){
                bw.write(arr[i]+" ");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
