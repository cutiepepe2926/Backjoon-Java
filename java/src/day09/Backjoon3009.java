package day09;

import java.io.*;
import java.util.StringTokenizer;

public class Backjoon3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st3.nextToken());
        int y3 = Integer.parseInt(st3.nextToken());

        int x = x1 ^ x2 ^ x3;
        int y = y1 ^ y2 ^ y3;
        System.out.println(x+" "+y);

    }
}
