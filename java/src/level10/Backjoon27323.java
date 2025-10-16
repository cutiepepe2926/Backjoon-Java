package level10;

import java.io.*;


public class Backjoon27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sero = Integer.parseInt(br.readLine());
        int garo = Integer.parseInt(br.readLine());

        System.out.println(garo*sero);
    }
}
