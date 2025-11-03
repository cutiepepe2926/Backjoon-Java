package level13;

import java.io.*;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        //2미만인 경우
        if (N<2) {
            System.out.println(0);
        }
        else {
            count++;
        }

        for (int i=3; N>2 && i<=N; i+=2) {
            
        }

    }
}
