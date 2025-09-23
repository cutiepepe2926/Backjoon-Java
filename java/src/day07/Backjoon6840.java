package day07;

import java.io.*;
import java.util.*;

public class Backjoon6840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s[] = new int[3];
        int max=0;
        int min=101;
        int result=0;
        for(int i=0;i<3;i++){
            s[i]=Integer.parseInt(br.readLine());
            if(max<s[i]){
                max=s[i];
            }
            if(min>s[i]){
                min=s[i];
            }
        }
        for(int i=0;i<3;i++){
            if(s[i]!=max && s[i]!=min){
                result = s[i];
            }
        }
        System.out.println(result);
    }
}
