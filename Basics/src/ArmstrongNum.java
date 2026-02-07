package Arrays;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int originalVal = n;
        int numOfDigits = CountDigit.countNum(n);
        int sum=0;
        while (n>0){
            int digit = n%10;
            int arm = (int)Math.pow(digit,numOfDigits);
            sum+=arm;
            n/=10;
        }
        if(sum==originalVal){
            System.out.println("the number is armstrong");
        }
        else {
            System.out.println("The number is not armstrong");

        }
    }
}
