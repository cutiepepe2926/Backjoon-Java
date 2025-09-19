package day04;

import java.io.*;
import java.util.*;

public class Backjoon2439 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        for(int i=1;i<=N;i++){
            for(int k=1; k<=N; k++){
                if(k<=N-i){
                    bw.write(" ");
                }
                else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}