package day04;

import java.util.Arrays;

public class MethodEx04 {
    public static void main(String[] args) {

        //배열을 매개변수로 전달받거나, 배열을 반환하는 메서드?? yes
        //변수명으로 전달
        int[] arr = {1,2,3};
        some(arr);

        String[] result = sayHello();
        System.out.println(Arrays.toString(result));
    }

    //매개변수로 배열받는 메서드
    static void some(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    //배열을 반환하는 메서드
    static String[] sayHello() {

        String[] arr = {"Hello", "World"};

        return arr;
    }
    
}
