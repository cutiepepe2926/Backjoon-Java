package level11;

import java.io.*;

public class Backjoon24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = (n*(n-1)*(n-2))/6;
        System.out.println(result+"\n"+3);
    }
}
