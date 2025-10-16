package day09;

import java.io.*;
import java.util.*;

public class Backjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 올라간 높이
        int A = Integer.parseInt(st.nextToken());

        // 내려가 높이
        int B = Integer.parseInt(st.nextToken());

        // 목표 높이
        int V = Integer.parseInt(st.nextToken());

        // 걸린 날
        int Day = (V-B)/(A-B);

        if( (V - B) % (A - B) != 0 ) {
            Day++;
        }
        System.out.println(Day);
    }
}