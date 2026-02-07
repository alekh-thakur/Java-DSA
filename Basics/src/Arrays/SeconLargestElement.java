package Arrays;

public class SeconLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,34,5,76,45,51};
        int result = secondLargestElement(arr);
        System.out.println(result);
    }
    static  int secondLargestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]> largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}
