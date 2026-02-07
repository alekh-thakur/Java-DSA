package Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {23,34,65,78,43,54};
        int res = minElement(arr);
        System.out.println(res);
    }
    static int minElement(int[] arr){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
