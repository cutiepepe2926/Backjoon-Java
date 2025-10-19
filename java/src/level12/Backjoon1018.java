package level12;

import java.io.*;
import java.util.*;

public class Backjoon1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] chessPlate = new String[N][M];

        for (int i=0; i<N; i++) {
            String[] line = br.readLine().split("");
            for (int j=0; j<line.length; j++) {
                chessPlate[i][j] = line[j];
            }
        }

        for (int i=0; i<8; i++) {

        }
    }
}
