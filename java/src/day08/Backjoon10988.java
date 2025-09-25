package day08;

import java.io.*;
import java.util.*;

public class Backjoon10988 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int result = 0;
        for(int i=0, j=n-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                result = 0;
                break;
            }
            else {
                result = 1;
            }
        }
        System.out.println(result);
    }
}
