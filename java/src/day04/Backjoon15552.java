package day04;

import java.io.*;
import java.util.*;

public class Backjoon15552 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int T = Integer.parseInt(st.nextToken());

        for(int i=0;i<T;i++){
            String s2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(s2);
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int result = a+b;
            bw.write(result+"\n");

        }
        bw.flush();
        br.close();
        bw.close();
    }
}
