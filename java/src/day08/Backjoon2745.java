package day08;

import java.util.*;
import java.io.*;

public class Backjoon2745 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        //결과
        long result = 0;

        for(int i=0;i<N.length();i++){
            int ch=0;
            if('0'<= N.charAt(i) && N.charAt(i)<='9'){
                ch = N.charAt(i)-'0';
            }
            else{
                ch = N.charAt(i)-'A' + 10;
            }
            result = result * B + ch;
        }
        System.out.println(result);
    }
}
