package day08;

import java.io.*;
import java.util.*;

public class Backjoon2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //9 x 9 행렬 생성
        int matrix[][] = new int[9][9];
        
        int max = 0; //최대값을 담을 변수
        int garo = 0; //행 번호를 담을 변수
        int sero = 0; //열 번호를 담을 변수
        
        //행렬의 각 위치에 값 입력과 동시에 최대값 비교
        for(int i=0;i<matrix.length;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if(max <matrix[i][j]){
                    max = matrix[i][j];
                    garo = i;
                    sero = j;
                }
                
            }
        }
        System.out.println(max);
        System.out.println((garo+1)+" "+(sero+1));
    }
}
