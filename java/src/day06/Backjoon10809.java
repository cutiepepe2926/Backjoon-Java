package day06;

import java.io.*;
import java.util.*;

public class Backjoon10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String result[] = new String[26];
        for(int i=0;i<26;i++){
            result[i] = "-1";
        }
        for(int i=0;i<S.length();i++){
            result[((int)S.charAt(i)%97)] = String.valueOf(S.indexOf(S.charAt(i)));
        }
        for(int i=0;i<26;i++){
            System.out.print(result[i]+" ");
        }
    }
}
