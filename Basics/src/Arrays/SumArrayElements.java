package Arrays;

public class SumArrayElements {
    public static void main(String[] args) {
        int[] arr = {12,34,65,7,3,64};
        int result = sumElements(arr);
        System.out.println(result);
    }
    static  int sumElements(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
