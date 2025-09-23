package day06;

import java.io.*;
import java.util.*;

public class Backjoon5622 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = 0;
        for(int i=0;i<s.length();i++){
            int time = (int)s.charAt(i)%65;
            if(time<3){ //ABC
                result += 3;
            }
            else if(time<6){ //DEF
                result += 4;
            }
            else if(time<9){ //GHI
                result += 5;
            }
            else if(time<12){ //JKL
                result += 6;
            }
            else if(time<15){ //MNO
                result += 7;
            }
            else if(time<19){ //PQRS
                result += 8;
            }
            else if(time<22){ //TUV
                result += 9;
            }
            else if(time<26){ //WXYZ
                result += 10;
            }
        }
        System.out.println(result);
    }
}
