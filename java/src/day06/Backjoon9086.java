package day06;

import java.util.*;
import java.io.*;

public class Backjoon9086 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                if(j==0){
                    bw.write(s.charAt(j));
                }
                if(j==s.length()-1){
                    bw.write(s.charAt(j)+"\n");
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
