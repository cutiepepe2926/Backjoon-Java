package quiz.quiz01;

import java.io.*;
import java.util.*;

public class Quiz06 {
    public static void main(String[] args) throws IOException {
        gugudan(4);
        System.out.println(isEven(3));
        System.out.println(circleArea(3));
        System.out.println(countDiv(12));
        System.out.println(abs(3));
        System.out.println(abs(-3));
    }

    // 문제 1: 구구단 출력 (레벨 1)
    // - 숫자를 받아서 해당 단수에 해당하는 구구단을 출력하세요.
    // - 반환값이 없는 함수입니다.
    public static void gugudan(int dan){
        for(int i=1;i<=9;i++){
            System.out.println(dan+" * "+i+" = "+(dan*i));
        }
    }

    // 문제 2: 짝수 판별 (레벨 2)
    // - 숫자를 받아서 짝수인지 홀수인지 판별하는 함수 isEven을 만들어보세요.
    // - 짝수면 true, 홀수면 false를 반환하세요.
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else return false;
    }

    // 문제 3: 원의 넓이 (레벨 2)
    // - 반지름을 받아서 원의 넓이를 계산하는 함수 circleArea를 만들어보세요.
    // - 원의 넓이 = π × 반지름² (π는 3.14159 사용)
    public static double circleArea(double r){
        double PI = 3.14;
        return r*r*PI;
    }

    // 문제 4: 약수 개수 (레벨 3)
    // - 양의 정수를 받아서 약수의 개수를 세는 함수 countDiv를 만들어보세요.
    // - 예시: 12의 약수는 1, 2, 3, 4, 6, 12이므로 6개
    public static int countDiv(int n){
        int result = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                result +=1;
            }
        }
        return result;
    }

    // 문제 5: 절대값 반환 (레벨 3)
    // - 숫자를 받아서 절대값을 반환하는 함수 abs를 만들어보세요.
    // - 예시: abs(-5) → 5, abs(3) → 3
    public static int abs(int n){
        if(n<0){
            return -n;
        }
        else return n;
    }
}
