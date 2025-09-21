package day06;

import java.util.*;
import java.io.*;

public class Backjoon1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        try {
            for(int i=0; i<1000000;i++){
                if(st.nextToken().equals(null)){
                    break;
                }
                result +=1;
            }
        } catch (NoSuchElementException e){
            System.out.println(result);
        }
    }
}
