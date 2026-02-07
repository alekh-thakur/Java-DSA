package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {34,44,56,45,6,237};
        int res =  maxElement(arr);
        System.out.println(res);
    }
    static  int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
