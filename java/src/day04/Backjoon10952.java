package day04;

import java.io.*;
import java.util.*;

public class Backjoon10952 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean i = true;
        while(i){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a =  Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0){
                i = false;
            }
            else {
                bw.write(a+b+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
