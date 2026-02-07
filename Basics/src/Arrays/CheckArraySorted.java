package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean result= checkArray(arr);
        System.out.println(result);
    }

    static boolean checkArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

}
