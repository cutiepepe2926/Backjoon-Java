package quiz.quiz20;

import java.text.*;
import java.util.*;
import java.io.*;
public class MainClass {
    public static void main(String[] args) {
        /*
        민경이가 입사한 회사에서는 매일 오전 7시에 연계회사에서
        날짜유형의 csv파일을 전송을 해줍니다.

        이 파일의 이름은 2025_10_01_data.csv 파일 유형입니다.
        그래서 민경이는 아침마다 csv파일을 읽어서 가져오는 작업을 해야합니다.

        Date클래스를 활용해서 오늘날짜 기준의 파일을 읽고,
        , 기준으로 분리한 다음에 나이와 이름을 출력해주세요.
         */
        try {
            // 1. 오늘 날짜 구하기
            Date today = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
            String todayStr = sdf.format(today);

            // 2. 파일 이름 생성
            String path = "C:\\Users\\user\\IdeaProjects\\java\\src\\quiz\\quiz20\\";
            String fileName = path+todayStr + "_data.csv";
            System.out.println("읽을 파일명: " + fileName);

            // 3. 파일 읽기
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String age = parts[0].trim();
                    String name = parts[1].trim();
                    System.out.println("나이: " + age + ", 이름: " + name);
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
