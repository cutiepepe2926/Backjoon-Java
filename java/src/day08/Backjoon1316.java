package day08;

import java.util.*;
import java.io.*;

public class Backjoon1316 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i=0;i<n;i++){
            if(GroupWordChecker(br.readLine())){
                result++;
            }
        }
        System.out.println(result);
    }
    public static boolean GroupWordChecker(String args){
        String words[] = args.split("");
        boolean check_list[] = new boolean[26];
        String prev_word = null;
        for(int i=0;i<words.length;i++){
            
            //시작점이 0인 경우, 체크하고 이전 문자 저장
            if(i==0){
                check_list[words[i].charAt(0)-'a'] = true;
                prev_word = words[i];
                continue;
            }
            //본적 있는 문자라면
            else if(check_list[words[i].charAt(0)-'a']==true){
                //만약 이전문자와 같다면 패스
                if(words[i].equals(prev_word)){
                    prev_word = words[i];
                    continue;
                }
                //만약 이전문자와 다르면 그룹문자가 아님
                else{
                    return false;
                }
            }
            //만약 처음 보는 문자라면 continue
            else if(check_list[words[i].charAt(0)-'a']==false){
                check_list[words[i].charAt(0)-'a'] = true;
                prev_word = words[i];
                continue;
            }
        }
        return true;
    }
}
