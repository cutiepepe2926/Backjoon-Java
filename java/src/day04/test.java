package day04;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            if((int)a.charAt(i)>=97){
                char b = (char) ((int)a.charAt(i) - 32);
                System.out.print(b);
            }
            else {
                char c = (char) ((int)a.charAt(i) + 32);
                System.out.print(c);
            }
        }
    }
}
