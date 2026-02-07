package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ros = new int[5];




//        for(int i=0;i< ros.length;i++){
//            ros[i] = sc.nextInt();
//        }

//        for(int num: ros){
//            System.out.print(num + " ");
//        }
//        System.out.println(Arrays.toString(ros));

        String[] str = new String[5];
        for(int i = 0;i<str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));



    }
}
