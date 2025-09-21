package day06;

import java.util.*;
import java.io.*;

public class Backjoon2475 {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for(int i=0; i<5; i++){
            int temp = Integer.parseInt(st.nextToken());
            temp *= temp;
            result += temp;
        }
        System.out.println(result%10);
    }
}
