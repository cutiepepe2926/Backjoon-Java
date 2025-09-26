package day08;

import java.util.*;
import java.io.*;

public class Backjoon25206 {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        float credit_list[] = new float[20];
        String grade_list[] = new String[20];
        float credit_grade = 0;
        float credit_total = 0;
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            credit_list[i] = Float.parseFloat(st.nextToken());
            grade_list[i] = st.nextToken();
        }

        for(int i=0;i<20;i++){
            if(grade_list[i].equals("P")){
                continue;
            }
            else{
                credit_grade += (float)(credit_list[i]*(
                (grade_list[i].equals("A+"))?4.5:
                        (grade_list[i].equals("A0"))?4.0:
                                (grade_list[i].equals("B+"))?3.5:
                                        (grade_list[i].equals("B0"))?3.0:
                                                (grade_list[i].equals("C+"))?2.5:
                                                        (grade_list[i].equals("C0"))?2.0:
                                                                (grade_list[i].equals("D+"))?1.5:
                                                                        (grade_list[i].equals("D0"))?1.0:0.0
                ));
                credit_total += credit_list[i];
            }
        }

        System.out.println(credit_grade/credit_total);
    }
}
