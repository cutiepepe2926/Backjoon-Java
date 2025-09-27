package day09;

import java.io.*;
import java.util.*;

public class Backjoon2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        int Quarter = 0;
        int Dime = 0;
        int Nickel = 0;
        int Penny = 0;

        for(int i=0;i<T;i++){
            int C = Integer.parseInt(br.readLine());
            Quarter = C/25;
            Dime = (C%25)/10;
            Nickel = (C%25)%10/5;
            Penny = C%5;
            bw.write(Quarter+ " "+Dime+" "+Nickel+" "+Penny+"\n" );
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
