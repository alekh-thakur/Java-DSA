package Basics;

import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int even=0;
        int odd=0;
        while(n>0){
            int digits = n %10;
            if(digits % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            n/=10;
        }
        System.out.println("Even digits: " +even);
        System.out.println("Odd digits: " +odd);


    }
}
