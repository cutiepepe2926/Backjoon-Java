package day06;

import java.io.*;
import java.util.*;

public class Backjoon2675 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            String result ="";
            for(int j=0; j<S.length(); j++){
                for(int k=0; k<R; k++){
                    result += S.charAt(j);
                }
            }
            bw.write(result+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
