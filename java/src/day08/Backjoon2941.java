package day08;

import java.util.*;
import java.io.*;

public class Backjoon2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=","?");
        System.out.println(s.length());
//        String str[] = br.readLine().split("");
//        System.out.println(Arrays.toString(str));
//
//        int result = 0;
//        for(int i=0; i<str.length; i++){
//            if(str[i].equals("c")){
//                if(str[i+1].equals("=") && str[i+1]!=null){
//                    result++;
//                    i++;
//                    //i++;
//                }
//                else if(str[i+1].equals("-") && str[i+1]!=null){
//                    result++;
//                    i++;
//                    //i++;
//                }
//                else {
//                    result++;
//                }
//            }
//            else if(str[i].equals("d")){
//                if(str[i+1].equals("z") && str[i+1]!=null){
//                    if(str[i+2].equals("=") && str[i+2]!=null){
//                        result++;
//                        i++;
//                        i++;
//                        //i++;
//                    }
//                    else {
//                        result++;
//                    }
//                }
//                else if(str[i+1].equals("-") && str[i+1]!=null){
//                    result++;
//                    i++;
//                    //i++;
//                }
//                else {
//                    result++;
//                }
//            }
//            else if(str[i].equals("l")){
//                if(str[i+1].equals("j") && str[i+1]!=null){
//                    result++;
//                    i++;
//                    //i++;
//                }
//                else {
//                    result++;
//                }
//            }
//            else if(str[i].equals("n")){
//                if(str[i+1].equals("j") && str[i+1]!=null){
//                    result++;
//                    i++;
//                    //i++;
//                }
//                else {
//                    result++;
//                }
//            }
//            else if(str[i].equals("s")){
//                if(str[i+1].equals("=") && str[i+1]!=null){
//                    result++;
//                    i++;
//                    //i++;
//                }
//                else{
//                    result++;
//                }
//            }
//            else if(str[i].equals("z")){
//                if(str[i+1].equals("=") && str[i+1]!=null){
//                    result++;
//                    i++;
//                    //i++;
//                }
//                else {
//                    result++;
//                }
//            }
//            else {
//                result++;
//            }
//        }
    }
}
