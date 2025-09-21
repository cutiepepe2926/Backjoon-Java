package day06;

import java.util.*;
import java.io.*;

public class Backjoon2908 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] a = st.nextToken().split("");
        String[] b = st.nextToken().split("");
        String r_a ="";
        String r_b ="";
        for(int i=0,j=2;i<j;i++,j--){
            String temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            temp = b[i];
            b[i]=b[j];
            b[j]=temp;
        }
        for(int i=0;i<3;i++){
            r_a+=a[i];
            r_b+=b[i];
        }
        System.out.println(Integer.parseInt(r_a)>Integer.parseInt(r_b)?r_a:r_b);
    }
}
