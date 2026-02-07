package Arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {34,2,4,3,23,5,65,7,43};
        countEvenOdd(arr);
    }
    static void countEvenOdd(int[] arr){
        int even = 0,odd=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Total even numbers:" + even);
        System.out.println("Total odd numbers:" + odd);

    }
}
