package day03;

import java.util.*;

public class Backjoon2884 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(0 <= h && h <= 23 && 0<= m && m<=59){
            if(m>=45){
                System.out.println(h+" "+(m-45));
            }
            else{
                int rm = m-45;
                System.out.println(((h==0)?23:h-1)+" "+(60+rm));
            }
        }
    }
}
