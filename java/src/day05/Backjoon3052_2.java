package day05;

import java.util.*;
import java.io.*;

public class Backjoon3052_2 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean check[] = new boolean[42];
        int result = 0;

        for(int i=0; i<10;i++){
            check[Integer.parseInt(br.readLine()) % 42] = true;
        }
        for(int i=0; i<42;i++){
            if(check[i]){
                result +=1;
            }
        }
        System.out.println(result);
    }
}
