package day03;

import java.util.*;

public class Backjoon9498 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(!(score<0)){
            System.out.println(
                    (score>=90)?"A":
                            (score>=80)?"B":
                                    (score>=70)?"C":
                                            (score>=60)?"D":"F"
            );
        }
    }
}
