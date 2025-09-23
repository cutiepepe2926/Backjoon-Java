package day06;

import java.util.*;
import java.io.*;

public class Backjoon3003 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int target[] = new int[]{1,1,2,2,2,8};
        int add[] = new int[6];

        for(int i=0; i<6; i++){
            add[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<6; i++){
            bw.write(target[i]-add[i]+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
