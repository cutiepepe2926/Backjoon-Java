package day08;

import java.util.*;
import java.io.*;

public class Backjoon2738 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer NM = new StringTokenizer(br.readLine());

        //각각 N과 M 분리
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        //N x M 행렬 A와 B 생성
        int matrixA[][] = new int[N][M];
        int matrixB[][] = new int[N][M];

        //결과를 출력할 행렬 result 생성
        int result[][] = new int[N][M];
        
        //행렬 A에 대한 값 삽입
        //N방향 (행)
        for(int i=0;i<N;i++){
            //입력받기
            StringTokenizer line = new StringTokenizer(br.readLine());

            //M방향 (열)
            for(int j=0;j<M;j++){
                //각 행렬 위치에 값 더하기
                matrixA[i][j] += Integer.parseInt(line.nextToken());
            }
        }
        //행렬 B에 대한 값 삽입
        //N방향 (행)
        for(int i=0;i<N;i++){
            //입력받기
            StringTokenizer line = new StringTokenizer(br.readLine());

            //M방향 (열)
            for(int j=0;j<M;j++){
                //각 행렬 위치에 값 더하기
                matrixB[i][j] += Integer.parseInt(line.nextToken());
            }
        }

        //행렬 A와 B에 대한 합 계산
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                result[i][j] = matrixA[i][j] + matrixB[i][j];
                bw.write(result[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
