package day06;

import java.io.*;
import java.util.*;

public class Backjoon2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<=N;i++){
            for(int j=0;j<N-i;j++){
                bw.write(" ");
            }
            for(int j=0;j<2*i-1;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i=1;i<N;i++){
            for(int j=1;j<=i;j++){
                bw.write(" ");
            }
            for(int j=0;j<2*(N-i)-1;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
