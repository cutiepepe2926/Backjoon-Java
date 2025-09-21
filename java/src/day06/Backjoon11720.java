package day06;

import java.util.*;
import java.io.*;

public class Backjoon11720 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String list[] = s.split("");
        int result = 0;
        for(int i=0;i<N;i++){
            result += Integer.parseInt(list[i]);
        }
        System.out.println(result);
    }
}
