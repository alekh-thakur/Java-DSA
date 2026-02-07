package Arrays;

import java.util.Arrays;

public class PassingFunc {
    public static void main(String[] args) {
        int[] nums = {3,43,5,46,99,7,74};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void change(int[] arr){
        arr[1]=33;
    }
}
