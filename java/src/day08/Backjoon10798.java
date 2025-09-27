package day08;

import java.util.*;
import java.io.*;

public class Backjoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //칠판에 있는 글자들 목록
        String board[][] = new String[15][15];

        //칠판에 있는 자석을 읽어서 저장한다
        for(int i=0; i<5; i++){
            String string[] = br.readLine().split("");
            for(int j=0; j<string.length; j++){
                board[i][j] = string[j];
            }
        }
        
        //자석을 세로로 읽는다
        for(int i=0; i<15;i++){
            for(int j=0; j<15; j++){
                if(board[j][i]==null){
                    continue;
                }
                else {
                    bw.write(board[j][i]);
                }
            }
        }

        //출력
        bw.flush();
        br.close();
        bw.close();
    }
}
