package day09;

import java.io.*;
import java.util.*;

public class Backjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long V = Integer.parseInt(st.nextToken());

        long result = 0;
        long check = 0;



        for(int i=0; ;i++){
            if(result>=V){
                break;
            }
            else {
                result += A;
                check++;
                if(result<V){
                    result -= B;
                    continue;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(check);
    }
}
//5 = 2*day - 1*day
//an =