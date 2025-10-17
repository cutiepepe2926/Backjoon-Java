package level10;

import java.io.*;
import java.util.*;

public class Backjoon5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int max = Math.max(Math.max(a,b),c);


            // 종료 체크
            if ( a == 0 & b == 0 & c == 0 ) {
                break;
            }

            // 삼각형 조건 불만족 시
            if (max >= a+b+c-max) {
                bw.write("Invalid\n");
                continue;
            }

            // 길이가 모두 같은 경우
            if ( a == b & b == c & a == c ) {
                bw.write("Equilateral\n");
                continue;
            }

            // 두 변의 길이만 같은 경우
            if ( a == b | b == c | a == c){
                bw.write("Isosceles\n");
                continue;
            }

            // 세 변의 길이가 모두 다른 경우
            bw.write("Scalene\n");

        }

        bw.flush();
        br.close();
        bw.close();
    }
}
