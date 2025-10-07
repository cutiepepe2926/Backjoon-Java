package day10;

import java.util.*;

public class Programmers150370 {
    public static void main(String[] args){

    }
}

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        //today "YYYY.MM.DD"
        //오늘 날짜를 28일식으로 계산해서 "일" 형식으로 변환
        int todayAll = calcToday(today);

        //terms 1<= terms <= 20 약관의 유효기간 (1차원배열)
        //terms의 원소는 "약관 종류 유효기간" 형태의 약관 종류와 유효기간을 공백 하나로 구분한 문자열
        //약관 종류는 A~Z중 알파벳 대문자 하나이며, terms 배열에서 약관 종류는 중복되지 않습니다.

        //terms 값을 약관명과 기간으로 담을 HashMap 생성
        // ex) A:6
        Map<String, Integer> termsMap = new HashMap<>();

        //약관만큼 반복
        for(String t : terms){
            String[] parts = t.split(" "); //공백으로 쪼개서 String배열에 저장
            termsMap.put(parts[0], Integer.parseInt(parts[1]));
            //약관명은 그대로 넣고, 기간만 정수형 변환해서 넣기
        }

        //privacies 개인정보 (1차원배열)
        //1 ≤ privacies의 길이 ≤ 100
        //privacies[i]는 i+1번 개인정보의 수집 일자와 약관 종류
        //날짜는 "YYYY.MM.DD" 형태의 개인정보가 수집된 날짜를 나타내며, today 이전의 날짜만 주어집니다.
        //privacies의 약관 종류는 항상 terms에 나타난 약관 종류만 주어집니다.

        /*그러면 privacies에서 주어지는게 날짜랑 약관이니깐 주어진 날짜는 28일식으로 변환하고, 약관은 HashMap에서 접근해서 값
        가져와서 약관*28하고 더한다음에 오늘날짜 총합이랑 비교해서 오늘날짜 총합보다 작거나 같으면 파기 아니면 무시해야지
        그럼 일단, privacies에서 하나받아와서 공백단위로 쪼개고 그다음에 날짜는 총일수로 변환하고 약관도 일수로 변환그리고 합 출력
        */

        //가변 배열하나 뚝딱
        List<Integer> expireList = new ArrayList<>();

        for(int i=0; i<privacies.length;i++){
            String[] temp = privacies[i].split(" "); //공백쪼개기
            String startDay = temp[0]; //수집일
            String termName = temp[1]; //약관명

            //총합일수 계산
            int expireDay = calcToday(startDay) + (termsMap.get(termName)*28);

            if(todayAll >= expireDay){
                expireList.add(i+1);
            }
            else {
                continue;
            }
        }


        //today와 privacies에 등장하는 날짜의 YYYY는 연도, MM은 월, DD는 일을 나타내며 점(.) 하나로 구분
        // 2000 ≤ YYYY ≤ 2022 ||  1 ≤ MM ≤ 12 || 1 ≤ DD ≤ 28
        // MM이 한 자릿수인 경우 앞에 0이 붙습니다.
        //DD가 한 자릿수인 경우 앞에 0이 붙습니다.

        //목표: 파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열에 담아 return
        //가변 배열을 정적배열에 추가
        int[] answer = new int[expireList.size()];
        for(int i=0; i<expireList.size();i++){
            answer[i] = expireList.get(i);
        }


        return answer;
    }

    //주어진 날짜를 28일식으로 변환하기
    private int calcToday(String today){
        String[] temp = today.split("\\.");
        int years = Integer.parseInt(temp[0]);
        int months = Integer.parseInt(temp[1]);
        int days = Integer.parseInt(temp[2]);
        return ((years*12*28) + (months*28) + days);
    }
}
