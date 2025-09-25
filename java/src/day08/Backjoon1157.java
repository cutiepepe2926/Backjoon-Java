package day08;

import java.io.*;
import java.util.*;

public class Backjoon1157 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase(); //사용자 입력 소문자 변환
        
        int result[] = new int[26]; //알파벳 갯수를 저장할 정수형 배열
        char arr[] = new char[s.length()]; //사용자로부터 입력받은 문자열을 각각 보관할 char 배열
        
        //입력받은 문자열을 각각 나눠서 할당
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        
        //각 문자를 아스키 코드를 사용해 result 배열에 저장
        for(int i=0;i<arr.length;i++){
            result[(int)arr[i]%97] += 1;
        }
        
        int max=-1; //가장 많이 사용된 숫자 판별용
        int max_word=0; //가장 많이 사용된 알파벳 판별용

        //가장 많이 사용된 알파벳 추출
        for(int i=0;i<result.length;i++){
            if(max<result[i]){
                max=result[i];
                max_word=i;
            }
        }

        int dup = 0; //중복여부확인
        
        //가장 많이 사용된 알파벳이 중복 존재하는지 확인
        for(int i=0; i<result.length;i++){
            if(i==max_word){ //자기 자신은 제외
                continue;
            }
            else{
                if(max==result[i]){
                    dup=1;
                }
            }
        }
        System.out.println((dup==1)?"?":(char)(max_word+65));
        //97=a,122=z, 65=A
    }
}
