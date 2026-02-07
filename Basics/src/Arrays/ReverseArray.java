package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {23,45,3,43,6,3};
        int[] res = reverseArray(arr);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    static int[] reverseArray(int[] arr){
        int j = arr.length-1;
        int i = 0;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
