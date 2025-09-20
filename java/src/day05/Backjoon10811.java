package day05;

import java.util.*;
import java.io.*;

public class Backjoon10811 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String setting = br.readLine();
        StringTokenizer setting_st = new StringTokenizer(setting);
        int N = Integer.parseInt(setting_st.nextToken());
        int M = Integer.parseInt(setting_st.nextToken());
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = i+1;
        }

        for(int i=0;i<M;i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            int pos = end;
            for(int j=start;j<=(start+end)/2;j++,pos--){
                int temp = arr[j];
                arr[j] = arr[pos];
                arr[pos] = temp;
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
