package day05;

import java.util.*;
import java.io.*;

public class Backjoon3052 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[10];

        for(int i=0; i<10;i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<10;i++){
            map.put(arr[i],0);
        }
        System.out.println(map.size());
    }
}
